/**
 * Created by pgsett on 04/04/2016.
 */
myApp.service('providerService', _providerService)
    .controller('providerController', providerController);

function providerController($scope, providerService) {
    getProviders(providerService, $scope);
    $scope.showError = false;
    $scope.showSucccess = false;
    $scope.openModalProvider = function (provider) {
        if (provider !== 0) {
            $scope.provider = provider;
        } else {
            $scope.provider = {};
        }
        $('#proveedorModal').modal("show");
    };
    $scope.isDisabled = true;
    $scope.createNewProvider = function (provider) {
        if (provider.id > 0) {
            var providersDTO = {};
            providersDTO.id = provider.id;
            providersDTO.name = provider.name;
            providersDTO.razonSocial = provider.razonSocial;
            providersDTO.cuit = provider.cuit;
            providersDTO.lastName = provider.lastName;
            providersDTO.email = provider.email;
            providersDTO.address = provider.address;
            providersDTO.telephone = provider.telephone;
            updateProvider(providersDTO, providerService, $scope);
        } else {
            createNewProvider(provider, providerService, $scope);
        }
    }

    $scope.removeProvider = function (id) {
        removeProvider(id, providerService, $scope);
    }

}

function removeProvider(id, servicio, $scope) {
    servicio.removeProvider(id).then(
        function (d) {
            if (d.success) {
                $scope.showSucccess = true;
                getProviders(servicio, $scope);
                $('#proveedorModal').modal("hide");
            } else {
                $scope.showError = true;
                $('#proveedorModal').modal("hide");
            }
        }
    )
}

function createNewProvider(provider, servicio, $scope) {
    servicio.createNewProvider(provider).then(
        function (d) {
            if (d.success) {
                $scope.showSucccess = true;
                getProviders(servicio, $scope);
                $('#proveedorModal').modal("hide");
            } else {
                $scope.showError = true;
                $('#proveedorModal').modal("hide");
            }
        }
    )
}

function updateProvider(provider, servicio, $scope) {
    servicio.updateProvider(provider).then(
        function (d) {
            if (d.success) {
                $scope.showSucccess = true;
                getProviders(servicio, $scope);
                $('#proveedorModal').modal("hide");
            } else {
                $scope.showError = true;
                $('#proveedorModal').modal("hide");
            }
        }
    )
}

function getProviders(servicio, $scope) {
    servicio.getProviders().then(
        function (d) {
            $scope.providers = d;
        }
    );
}


