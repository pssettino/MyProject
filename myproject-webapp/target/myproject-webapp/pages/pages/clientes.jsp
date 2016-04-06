<%--
  Created by IntelliJ IDEA.
  User: pgsett
  Date: 01/03/2016
  Time: 03:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div id="page-wrapper" ng-controller="customerController">
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">
                    Clientes
                    <%--<small>Subheading</small>--%>
                </h1>
                <ol class="breadcrumb">
                    <li>
                        <i class="fa fa-dashboard"></i> <a href="${pageContext.request.contextPath}/home">Home</a>
                    </li>
                    <li class="active">
                        <i class="fa fa-file"></i> Clientes
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
                            <label>Numero de Cliente</label>
                            <input class="form-control">

                            <p class="help-block">Escriba el numero del cliente a buscar.</p>
                        </div>
                        <div class="col-sm-4">
                            <label>Nombre</label>
                            <input class="form-control">

                            <p class="help-block">Escriba el nombre del cliente a buscar.</p>

                        </div>
                        <br>
                        <button type="button" class="btn btn-success"><i class="glyphicon glyphicon-search"></i>Buscar
                        </button>
                        <button type="button" class="btn btn-primary" ng-click="openModalCustomer(0)"><i
                                class="glyphicon glyphicon-plus"></i>Nuevo
                        </button>
                    </div>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-lg-12">

                <div class="table-responsive">
                    <table class="table table-bordered table-hover table-striped">
                        <thead>
                        <tr>
                            <th>N Cliente</th>
                            <th>Nombre</th>
                            <th>Apellido</th>
                            <th>Telefono</th>
                            <th>Direccion</th>
                            <th>email</th>
                            <th></th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr ng-repeat="customer in customers">
                            <td>{{customer.id}}</td>
                            <td>{{customer.name}}</td>
                            <td>{{customer.lastName}}</td>
                            <td>{{customer.telephone}}</td>
                            <td>{{customer.address}}</td>
                            <td>{{customer.email}}</td>
                            <td class="text-right">
                                <button type="button" class="btn btn-default" ng-click="openModalCustomer(customer)"><i
                                        class="glyphicon glyphicon-pencil"></i></button>
                                <button type="button" class="btn btn-default" ng-click="removeCustomer(customer.id)"><i
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
    <div class="modal fade" id="clienteModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                            aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">Cliente</h4>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <form role="form" novalidate>
                            <div class="row">
                                <div class="col-sm-6">
                                    <label class="control-label" for="numeroCliente">Numero de Cliente</label>
                                    <input type="text" class="form-control" id="numeroCliente" ng-model="customer.id"
                                           disabled="disabled">
                                    <br>
                                    <label class="control-label" for="nombreCliente">Nombre</label>
                                    <input type="text" class="form-control" id="nombreCliente" ng-model="customer.name">
                                    <br>
                                    <label class="control-label" for="emailCliente">E-Mail</label>
                                    <input type="text" class="form-control" id="emailCliente" ng-model="customer.email">
                                </div>
                                <div class="col-sm-6">
                                    <label class="control-label" for="telefonoCliente">Telefono</label>
                                    <input type="text" class="form-control" id="telefonoCliente"
                                           ng-model="customer.telephone">
                                    <br>
                                    <label class="control-label" for="apellidoCliente">Apellido</label>
                                    <input type="text" class="form-control" id="apellidoCliente"
                                           ng-model="customer.lastName">
                                    <br>
                                    <label class="control-label" for="direccionCliente">Direccion</label>
                                    <input type="text" class="form-control" id="direccionCliente"
                                           ng-model="customer.address">
                                </div>

                            </div>
                        </form>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary" ng-click="createNewCustomer(customer)">Save changes
                    </button>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="${pageContext.request.contextPath}/js/service/customerService.js"></script>
<script src="${pageContext.request.contextPath}/js/controller/customerController.js"></script>



