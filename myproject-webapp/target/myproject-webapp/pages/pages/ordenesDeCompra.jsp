<%--
  Created by IntelliJ IDEA.
  User: pgsett
  Date: 03/03/2016
  Time: 04:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div id="page-wrapper">
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">
                    Ordenes de Compra
                    <%--<small>Subheading</small>--%>
                </h1>
                <ol class="breadcrumb">
                    <li>
                        <i class="fa fa-dashboard"></i> <a href="${pageContext.request.contextPath}/home">Home</a>
                    </li>
                    <li class="active">
                        <i class="fa fa-file"></i> Ordenes de Compra
                    </li>
                </ol>
            </div>
        </div>
        <%--<div class="alert alert-success">--%>
        <%--<strong>Well done!</strong> You successfully read this important alert message.--%>
        <%--</div>--%>
        <%--<div class="alert alert-danger">--%>
        <%--<strong>Oh snap!</strong> Change a few things up and try submitting again.--%>
        <%--</div>--%>


        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#ordenDeCompraModal"><i
                class="glyphicon glyphicon-plus"></i>Nuevo
        </button>
        <br>
        <br>

        <div class="row">
            <div class="col-lg-12">
                <div class="table-responsive">
                    <table id="comprasTable" class="table table-bordered table-hover table-striped">
                        <thead>
                        <tr>
                            <th>N de Orden de Compra</th>
                            <th>Producto</th>
                            <th>Proveedor</th>
                            <th>Fecha de Entrega</th>
                            <th>Cantidad</th>
                            <th>Precio</th>
                            <th>Estado</th>
                            <th></th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>N de Orden de Compra</td>
                            <td>Producto</td>
                            <td>Proveedor</td>
                            <td>Fecha de Entrega</td>
                            <td>Cantidad</td>
                            <td>Precio</td>
                            <td>Estado</td>
                            <td class="text-right">
                                <button type="button" class="btn btn-default" data-toggle="modal"
                                        data-target="#ordenDeCompraModal"><i class="glyphicon glyphicon-pencil"></i>
                                </button>
                                <button type="button" class="btn btn-default"><i class="glyphicon glyphicon-remove"></i>
                                </button>
                            </td>
                        </tr>
                        <tr>
                            <td>N de Orden de Compra</td>
                            <td>Producto</td>
                            <td>Proveedor</td>
                            <td>Fecha de Entrega</td>
                            <td>Cantidad</td>
                            <td>Precio</td>
                            <td>Estado</td>
                            <td class="text-right">
                                <button type="button" class="btn btn-default" data-toggle="modal"
                                        data-target="#ordenDeCompraModal"><i class="glyphicon glyphicon-pencil"></i>
                                </button>
                                <button type="button" class="btn btn-default"><i class="glyphicon glyphicon-remove"></i>
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
    <div class="modal fade" id="ordenDeCompraModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                            aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">Orden de Compra</h4>
                </div>
                <div class="modal-body">
                    ...
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary">Save changes</button>
                </div>
            </div>
        </div>
    </div>
</div>

