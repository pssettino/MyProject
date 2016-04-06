<%--
  Created by IntelliJ IDEA.
  User: pgsett
  Date: 02/03/2016
  Time: 11:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div id="page-wrapper" ng-controller="providerController">
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">
                    Proveedores
                    <%--<small>Subheading</small>--%>
                </h1>
                <ol class="breadcrumb">
                    <li>
                        <i class="fa fa-dashboard"></i> <a href="${pageContext.request.contextPath}/home">Home</a>
                    </li>
                    <li class="active">
                        <i class="fa fa-file"></i> Proveedores
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
                            <label>Numero de Proveedor</label>
                            <input class="form-control">

                            <p class="help-block">Escriba el numero del proveedor a buscar.</p>
                        </div>
                        <div class="col-sm-4">
                            <label>Nombre</label>
                            <input class="form-control">

                            <p class="help-block">Escriba el nombre del proveedor a buscar.</p>

                        </div>
                        <br>
                        <button type="button" class="btn btn-success"><i class="glyphicon glyphicon-search"></i>Buscar
                        </button>

                        <button type="button" class="btn btn-primary" ng-click="openModalProvider(0)"><i
                                class="glyphicon glyphicon-plus"></i>Nuevo
                        </button>
                    </div>
                </div>
            </div>
        </div>


        <br>
        <br>

        <div class="row">
            <div class="col-lg-12">
                <div class="table-responsive">
                    <table class="table table-bordered table-hover table-striped">
                        <thead>
                        <tr>
                            <th>N° Proveedor</th>
                            <th>Razon Social</th>
                            <th>Nombre</th>
                            <th>Apellido</th>
                            <th>CUIT</th>
                            <th>Telefono</th>
                            <th>Direccion</th>
                            <th></th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr ng-repeat="provider in providers">
                            <td>{{provider.id}}</td>
                            <td>{{provider.razonSocial}}</td>
                            <td>{{provider.name}}</td>
                            <td>{{provider.lastName}}</td>
                            <td>{{provider.cuit}}</td>
                            <td>{{provider.telephone}}</td>
                            <td>{{provider.address}}</td>
                            <td class="text-right">
                                <button type="button" class="btn btn-default" ng-click="openModalProvider(provider)"><i
                                        class="glyphicon glyphicon-pencil"></i></button>
                                <button type="button" class="btn btn-default" ng-click="removeProvider(provider.id)"><i
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
    <div class="modal fade" id="proveedorModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                            aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">Proveedor</h4>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <form role="form">
                            <div class="row">
                                <div class="col-sm-6">
                                    <label class="control-label" for="numeroProveedor">Numero de Proveedor</label>
                                    <input type="text" class="form-control" id="numeroProveedor" ng-model="provider.id"
                                           disabled="disabled">
                                    <br>
                                    <label class="control-label" for="razonSocial">Razon Social</label>
                                    <input type="text" class="form-control" id="razonSocial"
                                           ng-model="provider.razonSocial"
                                    >
                                    <br>
                                    <label class="control-label" for="nombreProveedor">Nombre</label>
                                    <input type="text" class="form-control" id="nombreProveedor"
                                           ng-model="provider.name">
                                    <br>
                                    <label class="control-label" for="emailProveedor">E-Mail</label>
                                    <input type="text" class="form-control" id="emailProveedor"
                                           ng-model="provider.email">
                                </div>
                                <div class="col-sm-6">
                                    <label class="control-label" for="cuitProveedor">CUIT</label>
                                    <input type="text" class="form-control" id="cuitProveedor" ng-model="provider.cuit">
                                    <br>
                                    <label class="control-label" for="apellidoProveedor">Apellido</label>
                                    <input type="text" class="form-control" id="apellidoProveedor"
                                           ng-model="provider.lastName">
                                    <br>
                                    <label class="control-label" for="telephoneProveedor">Telefono</label>
                                    <input type="text" class="form-control" id="telephoneProveedor"
                                           ng-model="provider.telephone">
                                    <label class="control-label" for="direccionProveedor">Direccion</label>
                                    <input type="text" class="form-control" id="direccionProveedor"
                                           ng-model="provider.address">
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary" ng-click="createNewProvider(provider)">Save changes
                    </button>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="${pageContext.request.contextPath}/js/service/providerService.js"></script>
<script src="${pageContext.request.contextPath}/js/controller/providerController.js"></script>




