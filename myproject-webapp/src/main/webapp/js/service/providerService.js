/**
 * Created by pgsett on 04/04/2016.
 */
/**
 * Created by pgsett on 08/03/2016.
 */

var _providerService = function ($http) {

    this.getProviders = function () {
        return $http({
            method: 'GET',
            url: '/myproject/proveedores/getProviders'
        }).then(function (response) {
            return response.data.rows;
        });
    };


    this.createNewProvider = function (providersDTO) {
        return $http({
            method: 'POST',
            url: '/myproject/proveedores/createNewProvider',
            data: JSON.stringify(providersDTO),
            dataType: 'json',
            contentType: 'application/json'
        }).then(function (response) {
            return response.data;
        });
    }

    this.updateProvider = function (providersDTO) {
        return $http({
            method: 'POST',
            url: '/myproject/proveedores/updateProvider',
            data: JSON.stringify(providersDTO),
            dataType: 'json',
            contentType: 'application/json'
        }).then(function (response) {
            return response.data;
        });
    }

    this.removeProvider = function (id) {
        return $http({
            method: 'GET',
            url: '/myproject/proveedores/removeProvider/' + id
        }).then(function (response) {
            return response.data;
        });
    }

};