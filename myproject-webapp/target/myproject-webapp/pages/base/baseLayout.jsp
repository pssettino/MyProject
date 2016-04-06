<!DOCTYPE HTML>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-type" content="text/html;charset=UTF-8"/>
    <meta HTTP-EQUIV="CACHE-CONTROL" CONTENT="NO-CACHE"/>
    <meta HTTP-EQUIV="PRAGMA" CONTENT="NO-CACHE"/>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/sb-admin.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-datetimepicker.css">

    <script src='${pageContext.request.contextPath}/lib/jquery.js'></script>
    <script src='${pageContext.request.contextPath}/lib/angular.min.js'></script>
    <script src='${pageContext.request.contextPath}/lib/moment.js'></script>
    <script src='${pageContext.request.contextPath}/lib/bootstrap-datetimepicker.js'></script>
    <script src="${pageContext.request.contextPath}/lib/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/controller/init.js"></script>

    <title><spring:message code="application.title"/></title>
</head>
<body ng-app="myApp">
<div id="wrapper">
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <tiles:insertAttribute name="header"/>

        <tiles:insertAttribute name="menu"/>
    </nav>
    <tiles:insertAttribute name="filter"/>

    <tiles:insertAttribute name="body"/>
</div>
<div class="footer">
    <tiles:insertAttribute name="footer"/>
</div>
</body>
</html>