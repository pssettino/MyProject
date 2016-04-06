/**
 * Created by pgsett on 08/03/2016.
 */

var _customerService = function ($http) {

    this.getCustomers = function () {
        return $http({
            method: 'GET',
            url: '/myproject/clientes/getCustomers'
        }).then(function (response) {
            return response.data.rows;
        });
    };


    this.createNewCustomer = function (customersDTO) {
        return $http({
            method: 'POST',
            url: '/myproject/clientes/createNewCustomer',
            data: JSON.stringify(customersDTO),
            dataType: 'json',
            contentType: 'application/json'
        }).then(function (response) {
            return response.data;
        });
    }

    this.updateCustomer = function (customersDTO) {
        return $http({
            method: 'POST',
            url: '/myproject/clientes/updateCustomer',
            data:JSON.stringify(customersDTO),
            dataType: 'json',
            contentType: 'application/json'
        }).then(function (response) {
            return response.data;
        });
    }

    this.removeCustomer = function (id) {
        return $http({
            method: 'GET',
            url: '/myproject/clientes/removeCustomer/'+id
        }).then(function (response) {
            return response.data;
        });
    }

};