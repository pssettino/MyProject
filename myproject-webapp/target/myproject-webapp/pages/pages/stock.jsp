<%--
  Created by IntelliJ IDEA.
  User: pgsett
  Date: 03/03/2016
  Time: 12:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div id="page-wrapper" ng-controller="stockController">
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">
                    Control de Stock
                    <%--<small>Subheading</small>--%>
                </h1>
                <ol class="breadcrumb">
                    <li>
                        <i class="fa fa-dashboard"></i> <a href="${pageContext.request.contextPath}/home">Home</a>
                    </li>
                    <li class="active">
                        <i class="fa fa-file"></i> Stock
                    </li>
                </ol>
            </div>
        </div>
        <div class="alert alert-success" ng-show="showSucccess">
            <strong>Well done!</strong> You successfully read this important alert message.
        </div>
        <div class="alert alert-danger" ng-show="showError">
            <strong>Oh snap!</strong> Change a few things up and try submitting again.
        </div>

        <div class="panel panel-info">
            <div class="panel-heading">
                <h3 class="panel-title">Buscar</h3>
            </div>
            <div class="panel-body">
                <div class="form-group">
                    <div class="row">
                        <div class="col-sm-4">
                            <label>Codigo de Producto</label>
                            <input class="form-control">

                            <p class="help-block">Escriba el numero del producto a buscar.</p>
                        </div>
                        <div class="col-sm-4">
                            <label>Descripcion</label>
                            <input class="form-control">

                            <p class="help-block">Escriba el nombre del producto a buscar.</p>

                        </div>
                        <br>
                        <button type="button" class="btn btn-success"><i class="glyphicon glyphicon-search"></i>Buscar
                        </button>

                        <button type="button" class="btn btn-primary" ng-click="openModalStock(0)"><i
                                class="glyphicon glyphicon-plus"></i>Nuevo
                        </button>
                    </div>
                </div>
            </div>
        </div>

        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#stockModal"><i class="glyphicon glyphicon-plus"></i>Nuevo</button>
        <br>
        <br>

        <div class="row">
            <div class="col-lg-12">
                <div class="table-responsive">
                    <table id="stockTable" class="table table-bordered table-hover table-striped">
                        <thead>
                        <tr>
                            <th>N Stock</th>
                            <th>Codigo Producto</th>
                            <th>Descripcion</th>
                            <th>Unidades en Stock</th>
                            <th></th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr ng-repeat="stock in stocks">
                            <td>{{stock.id}}</td>
                            <td>{{stock.product.id}}</td>
                            <td>{{stock.product.description}}</td>
                            <td>{{stock.quantity}}</td>
                            <td class="text-right">
                                <button type="button" class="btn btn-default" ng-click="openModalStock(stock)"><i
                                        class="glyphicon glyphicon-pencil"></i></button>
                                <button type="button" class="btn btn-default" ng-click="openModalStock(stock.id)"><i
                                        class="glyphicon glyphicon-remove"></i>
                                </button>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>

    <!-- Modal -->
    <div class="modal fade" id="stockModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">Stock</h4>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <form role="form">
                            <div class="row">
                                <div class="col-sm-6">
                                    <label class="control-label" for="stockId">N Stock</label>
                                    <input type="text" class="form-control" id="stockId" ng-model="stock.id"
                                           disabled="disabled">

                                    <label class="control-label" for="producto">Producto</label>
                                    <select class="form-control" id="producto"
                                            ng-model="stock.product"
                                            ng-options="product.description for product in products"
                                            ng-selected="stock.product.id === product.id"
                                    >
                                        <option value="">Seleccione una opcion...</option>
                                    </select>
                                    <br>

                                </div>
                                <div class="col-sm-6">
                                    <label class="control-label" for="quantity">Unidades</label>
                                    <input type="text" class="form-control" id="quantity" ng-model="stock.quantity">
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary" ng-click="createNewStock(stock)">Save changes
                    </button>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="${pageContext.request.contextPath}/js/service/stockService.js"></script>
<script src="${pageContext.request.contextPath}/js/controller/stockController.js"></script>


