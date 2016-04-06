myApp.service('customerService', _customerService)
    .controller('customerController', customerController);

function customerController($scope, customerService) {
    getCustomers(customerService, $scope);
    $scope.showError = false;
    $scope.showSucccess = false;
    $scope.openModalCustomer = function (customer) {
        if (customer !== 0) {
            $scope.customer = customer;
        } else {
            $scope.customer = {};
        }
        $('#clienteModal').modal("show");
    };
    $scope.isDisabled = true;
    $scope.createNewCustomer = function (customer) {
        if (customer.id > 0) {
            var customersDTO = {};
            customersDTO.id = customer.id;
            customersDTO.name = customer.name;
            customersDTO.lastName = customer.lastName;
            customersDTO.email = customer.email;
            customersDTO.address = customer.address;
            customersDTO.telephone = customer.telephone;
            updateCustomer(customersDTO, customerService, $scope);
        } else {
            createNewCustomer(customer, customerService, $scope);
        }
    }

    $scope.removeCustomer = function (id) {
        removeCustomer(id, customerService, $scope);
    }

}

function removeCustomer(id, servicio, $scope) {
    servicio.removeCustomer(id).then(
        function (d) {
            if (d.success) {
                $scope.showSucccess = true;
                getCustomers(servicio, $scope);
                $('#clienteModal').modal("hide");
            } else {
                $scope.showError = true;
                $('#clienteModal').modal("hide");
            }
        }
    )
}

function createNewCustomer(customer, servicio, $scope) {
    servicio.createNewCustomer(customer).then(
        function (d) {
            if (d.success) {
                $scope.showSucccess = true;
                getCustomers(servicio, $scope);
                $('#clienteModal').modal("hide");
            } else {
                $scope.showError = true;
                $('#clienteModal').modal("hide");
            }
        }
    )
}

function updateCustomer(customer, servicio, $scope) {
    servicio.updateCustomer(customer).then(
        function (d) {
            if (d.success) {
                $scope.showSucccess = true;
                getCustomers(servicio, $scope);
                $('#clienteModal').modal("hide");
            } else {
                $scope.showError = true;
                $('#clienteModal').modal("hide");
            }
        }
    )
}

function getCustomers(servicio, $scope) {
    servicio.getCustomers().then(
        function (d) {
            $scope.customers = d;
        }
    );
}


