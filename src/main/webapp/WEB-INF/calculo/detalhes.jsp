<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Churradega - Calculadora de Churrasco</title>
<spring:url value="/calculo/salva" var="salva"></spring:url>

<link
	href='<spring:url value="https://use.fontawesome.com/releases/v5.7.0/css/all.css" />'
	rel="stylesheet" />
<link
	href='<spring:url value="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"/>'
	rel="stylesheet" />
<link href='<spring:url value="/css/styles.css"/>' rel="stylesheet" />
<script type="text/javascript"
	src='<spring:url value="https://kit.fontawesome.com/166f435d2b.js" />'></script>
<style>
body {
	background-image: url("../../images/fundo.png");
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
	<jsp:include page="${request.contextPath}/menu"></jsp:include>
</header>
<main>
	<div class="container">

			<div class="panel-footer text-center bg-dark purple-gradient">
				<span class="m-0 text-center text-white" style="font-size: 20px">Detalhamento
					do Calculo</span>
			</div>
        <label> Data de Cadastro : </label>&nbsp;<strong><tags:localDate date="${calculo.data }" /></strong>
		<table class="table table-sm table-striped">
			<thead class="thead">
				<tr>
					<th>Homens Qtd</th>
					<th>Mulheres Qtd</th>
					<th>Crianças Qtd</th>
					<th>Qtd de Carnes em KG</th>
					<th>Qtd de Cerveja em Latas</th>
					<th>Qtd de Refrigerantes em lts</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${calculo.qtdHomem}</td>
					<td>${calculo.qtdMulheres}</td>
					<td>${calculo.qtdCrianca }</td>
					<td>${calculo.qtdCarnes }</td>
					<td>${calculo.qtdCerveja }</td>
					<td>${calculo.qtdRefrigerantes }</td>
					

				</tr>
			</tbody>
		</table>

		<button class="btn btn-success" type="button"
			onclick="javascript:history.back()">Voltar</button>





	</div>




</main>

<footer class="footer">
	<div class="container">
		<span class="text-muted">Churradega - 2020 - Desenvolvido por:
			<strong>Marcelo / Alana / Rodrigo</strong>
		</span>
	</div>
</footer>
<script type="text/javascript"
	src='<spring:url value="https://code.jquery.com/jquery-3.5.1.slim.min.js" />'></script>
<script type="text/javascript"
	src='<spring:url value="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" />'></script>
<script type="text/javascript"
	src='<spring:url value="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"  />'></script>

</body>
</html>