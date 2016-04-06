<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.css"/>
<script src='${pageContext.request.contextPath}/lib/jquery-1.11.1.min.js'></script>
<script src="${pageContext.request.contextPath}/lib/bootstrap.min.js"></script>


<body>
<!--login modal-->
<div class="modal show" id="login" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h1 class="modal-title" id="myModalLabel">Login</h1>
            </div>
            <div class="modal-body">
                <c:if test="${not empty error}">
                    <div class="alert alert-danger" role="alert">
                        <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
                        <span class="sr-only">Error:</span>
                        ${error}
                    </div>
                </c:if>
                <form class="form" name='loginForm'
                      action="<c:url value='/j_spring_security_check' />" method='POST'>
                    <div class="form-group">
                        <input type="text" id="username" name="username" class="form-control input-lg"
                               placeholder="Username">
                    </div>
                    <div class="form-group">
                        <input type="password" id="password" name="password" class="form-control input-lg"
                               placeholder="Password"
                                >
                    </div>
                    <div class="form-group">
                        <input type="submit" class="btn btn-primary btn-lg btn-block" value="Sign In"/>
                        <span class="pull-right"><a href="#">Register</a></span><span><a href="#">Need help?</a></span>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<!-- script references -->

</body>
</html>