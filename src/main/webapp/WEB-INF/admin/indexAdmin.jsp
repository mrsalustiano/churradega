<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Churradega - Calculadora de Churrasco</title>

<link href='<spring:url value="https://use.fontawesome.com/releases/v5.7.0/css/all.css" />' rel="stylesheet" />
<link href='<spring:url value="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"/>' rel="stylesheet" />
<link href='<spring:url value="/css/styles.css"/>' rel="stylesheet" />
<script type="text/javascript" src='<spring:url value="https://kit.fontawesome.com/166f435d2b.js" />'></script>
    <style>
        body {
            background-image: url("images/fundo.png");
            background-repeat: no-repeat;
            background-size: cover;
            background-position: center center;
            background-color: #cccccc;
        }
        
        h2 {
            text-align: center;
        }
    </style>

</head>
    <header>
	<jsp:include page="/admin/menuAdmin"></jsp:include>
    </header>
    <main>

        <div class="container">

            <h2>Área Restrita</h2>

        </div>
        <hr>
        <div class="container">
            <br><br><br><br><br><br><br><br>
            <div class="d-flex justify-content-center">
                <img src="/images/restrita.jpg">
            </div>
        </div>
    </main>



    <footer class="footer">
        <div class="container">
            <span class="text-muted">Churradega - 2020 - Desenvolvido por: Marcelo / Alana / Rodrigo</span>
        </div>
    </footer>
<script type="text/javascript" src='<spring:url value="https://code.jquery.com/jquery-3.5.1.slim.min.js" />'></script>
<script type="text/javascript" src='<spring:url value="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" />'></script>
<script type="text/javascript" src='<spring:url value="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"  />'></script>

</body></html>