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
<div id="page-wrapper">
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
        <%--<div class="alert alert-success">--%>
        <%--<strong>Well done!</strong> You successfully read this important alert message.--%>
        <%--</div>--%>
        <%--<div class="alert alert-danger">--%>
        <%--<strong>Oh snap!</strong> Change a few things up and try submitting again.--%>
        <%--</div>--%>


        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#stockModal"><i class="glyphicon glyphicon-plus"></i>Nuevo</button>
        <br>
        <br>

        <div class="row">
            <div class="col-lg-12">
                <div class="table-responsive">
                    <table id="stockTable" class="table table-bordered table-hover table-striped">
                        <thead>
                        <tr>
                            <th>Codigo Producto</th>
                            <th>Descripcion</th>
                            <th>Unidades en Stock</th>
                            <th></th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>1234</td>
                            <td>Tinto La Yumba</td>
                            <td>500</td>
                            <td class="text-right">
                                <button type="button" class="btn btn-default" data-toggle="modal" data-target="#stockModal"><i class="glyphicon glyphicon-pencil"></i></button>
                                <button type="button" class="btn btn-default"><i class="glyphicon glyphicon-remove"></i></button>
                            </td>
                        </tr>
                        <tr>
                            <td>5678</td>
                            <td>Blanco La Yumba</td>
                            <td>250</td>
                            <td class="text-right">
                                <button type="button" class="btn btn-default"  data-toggle="modal" data-target="#stockModal"><i class="glyphicon glyphicon-pencil"></i></button>
                                <button type="button" class="btn btn-default"><i class="glyphicon glyphicon-remove"></i></button>
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
                                    <label class="control-label" for="producto">Producto</label>
                                    <select class="form-control" id="producto">
                                        <option>Seleccione una opcion...</option>
                                        <option>Tinto La Yumba</option>
                                        <option>Blanco La Yumba</option>
                                    </select>
                                    <br>

                                </div>
                                <div class="col-sm-6">
                                    <label class="control-label" for="unidades">Unidades</label>
                                    <input type="text" class="form-control" id="unidades">
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary">Save changes</button>
                </div>
            </div>
        </div>
    </div>
</div>
