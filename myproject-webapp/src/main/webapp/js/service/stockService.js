/**
 * Created by PGSETT on 21/04/2016.
 */
var _stockService = function ($http) {

    this.getProducts = function () {
        return $http({
            method: 'GET',
            url: '/myproject/stock/getProducts'
        }).then(function (response) {
            return response.data.rows;
        });
    };

    this.getStock = function () {
        return $http({
            method: 'GET',
            url: '/myproject/stock/getStock'
        }).then(function (response) {
            return response.data.rows;
        });
    };


    this.createNewStock = function (stockDTO) {
        return $http({
            method: 'POST',
            url: '/myproject/stock/createNewStock',
            data: JSON.stringify(stockDTO),
            dataType: 'json',
            contentType: 'application/json'
        }).then(function (response) {
            return response.data;
        });
    }

    this.updateStock = function (stockDTO) {
        return $http({
            method: 'POST',
            url: '/myproject/stock/updateStock',
            data: JSON.stringify(stockDTO),
            dataType: 'json',
            contentType: 'application/json'
        }).then(function (response) {
            return response.data;
        });
    }

    this.removeStock = function (id) {
        return $http({
            method: 'GET',
            url: '/myproject/stock/removeStock/' + id
        }).then(function (response) {
            return response.data;
        });
    }

};