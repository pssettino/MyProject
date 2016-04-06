/**
 * Created by pgsett on 06/04/2016.
 */

var _productService = function ($http) {

    this.getProducts = function () {
        return $http({
            method: 'GET',
            url: '/myproject/productos/getProducts'
        }).then(function (response) {
            return response.data.rows;
        });
    };

    this.getCategories = function () {
        return $http({
            method: 'GET',
            url: '/myproject/productos/getCategories'
        }).then(function (response) {
            return response.data.rows;
        });
    };


    this.createNewProduct = function (productsDTO) {
        return $http({
            method: 'POST',
            url: '/myproject/productos/createNewProduct',
            data: JSON.stringify(productsDTO),
            dataType: 'json',
            contentType: 'application/json'
        }).then(function (response) {
            return response.data;
        });
    }

    this.updateProduct = function (productsDTO) {
        return $http({
            method: 'POST',
            url: '/myproject/productos/updateProduct',
            data: JSON.stringify(productsDTO),
            dataType: 'json',
            contentType: 'application/json'
        }).then(function (response) {
            return response.data;
        });
    }

    this.removeProduct = function (id) {
        return $http({
            method: 'GET',
            url: '/myproject/productos/removeProduct/' + id
        }).then(function (response) {
            return response.data;
        });
    }

};