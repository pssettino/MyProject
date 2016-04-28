/**
 * Created by PGSETT on 21/04/2016.
 */
myApp.service('stockService', _stockService)
    .controller('stockController', stockController);

function stockController($scope, stockService) {
    getStock(stockService, $scope);
    getProducts(stockService, $scope);
    $scope.showError = false;
    $scope.showSucccess = false;
    $scope.openModalStock = function (stock) {
        if (stock !== 0) {
            $scope.stock = stock;
        } else {
            $scope.stock = {};
        }
        $('#stockModal').modal("show");
    };
    $scope.isDisabled = true;
    $scope.createNewStock = function (stock) {
        var product = {};
        product.id = stock.product.id;
        product.description = stock.product.description;
        stock.product = product;

        if (stock.id > 0) {
            var stockDTO = {};
            stockDTO.id = stock.id;
            stockDTO.product = stock.product;
            stockDTO.quantity = stock.quantity;
            updateStock(stockDTO, stockService, $scope);
        } else {
            createNewStock(stock, stockService, $scope);
        }
    }

    $scope.removeStock = function (id) {
        removeStock(id, stockService, $scope);
    }

}

function removeStock(id, servicio, $scope) {
    servicio.removeStock(id).then(
        function (d) {
            if (d.success) {
                $scope.showSucccess = true;
                getStock(servicio, $scope);
                $('#stockModal').modal("hide");
            } else {
                $scope.showError = true;
                $('#stockModal').modal("hide");
            }
        }
    )
}

function createNewStock(stock, servicio, $scope) {
    servicio.createNewStock(stock).then(
        function (d) {
            if (d.success) {
                $scope.showSucccess = true;
                getStock(servicio, $scope);
                $('#stockModal').modal("hide");
            } else {
                $scope.showError = true;
                $('#stockModal').modal("hide");
            }
        }
    )
}

function updateStock(stock, servicio, $scope) {
    servicio.updateStock(stock).then(
        function (d) {
            if (d.success) {
                $scope.showSucccess = true;
                getStock(servicio, $scope);
                $('#stockModal').modal("hide");
            } else {
                $scope.showError = true;
                $('#stockModal').modal("hide");
            }
        }
    )
}

function getStock(servicio, $scope) {
    servicio.getStock().then(
        function (d) {
            $scope.stocks = d;
        }
    );
}

function getProducts(servicio, $scope) {
    servicio.getProducts().then(
        function (d) {
            $scope.products = d;
        }
    );
}
