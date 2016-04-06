/**
 * Created by pgsett on 06/04/2016.
 */
myApp.service('productService', _productService)
    .controller('productController', productController);

function productController($scope, productService) {
    getProducts(productService, $scope);
    getCategories(productService, $scope);
    $scope.showError = false;
    $scope.showSucccess = false;
    $scope.openModalProduct = function (product) {
        if (product !== 0) {
            $scope.product = product;
        } else {
            $scope.product = {};
        }
        $('#productoModal').modal("show");
    };
    $scope.isDisabled = true;
    $scope.createNewProduct = function (product) {
        var category = {};
        category.id = product.category.id;
        category.description = product.category.description;
        product.category = category;
        
        if (product.id > 0) {
            var productsDTO = {};
            productsDTO.id = product.id;
            productsDTO.description = product.description;
            productsDTO.prise = product.prise;
            productsDTO.category = product.category;
            updateProduct(productsDTO, productService, $scope);
        } else {

            createNewProduct(product, productService, $scope);
        }
    }

    $scope.removeProduct = function (id) {
        removeProduct(id, productService, $scope);
    }

}

function removeProduct(id, servicio, $scope) {
    servicio.removeProduct(id).then(
        function (d) {
            if (d.success) {
                $scope.showSucccess = true;
                getProducts(servicio, $scope);
                $('#productoModal').modal("hide");
            } else {
                $scope.showError = true;
                $('#productoModal').modal("hide");
            }
        }
    )
}

function createNewProduct(product, servicio, $scope) {
    servicio.createNewProduct(product).then(
        function (d) {
            if (d.success) {
                $scope.showSucccess = true;
                getProducts(servicio, $scope);
                $('#productoModal').modal("hide");
            } else {
                $scope.showError = true;
                $('#productoModal').modal("hide");
            }
        }
    )
}

function updateProduct(product, servicio, $scope) {
    servicio.updateProduct(product).then(
        function (d) {
            if (d.success) {
                $scope.showSucccess = true;
                getProducts(servicio, $scope);
                $('#productoModal').modal("hide");
            } else {
                $scope.showError = true;
                $('#productoModal').modal("hide");
            }
        }
    )
}

function getProducts(servicio, $scope) {
    servicio.getProducts().then(
        function (d) {
            $scope.products = d;
        }
    );
}

function getCategories(servicio, $scope) {
    servicio.getCategories().then(
        function (d) {
            $scope.categories = d;
        }
    );
}
