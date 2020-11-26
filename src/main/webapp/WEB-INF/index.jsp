<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<spring:url value="/" var="home"></spring:url>
<spring:url value="/clientes/cadastrar" var="cadastro"></spring:url>
<spring:url value="/calculo" var="calculo"></spring:url>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Churradega - Calculadora de Churrasco</title>

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
	background-image: url("images/fundo.png");
	background-repeat: no-repeat;
	background-size: cover;
	background-position: center center;
	background-color: #cccccc;
}

h2 {
	text-align: center;
}

h5 {
	font-style: normal;
	font-weight: normal;
}
</style>

</head>
<header>
	<jsp:include page="/menu"></jsp:include>
</header>
<main>

	<div class="jumbotron jumbotron-fluid">
		<div class="container mb-2">
			<div class="row">
				<div class="col-sm-3"></div>
				<div class="col-lg">

					<h1 class="display-8">Cálculo on-line de Churrasco</h1>

				</div>
				<div class="col-sm-3"></div>

			</div>

		</div>
	</div>
	<div class="container mb-6">
		<h2>Bem vindo ao site de calculo para Churrasco</h2>
	</div>
	<br> <br>

	<div class="container mb-6">

		<div class="row mx-auto">
	
				<h5>Aqui voce calcula seu churrasco de forma simples e rapida,
					nosso algoritmo foi criado pensando em voce que deseja praticidade
					e economia nos seus gastos. Ao realizar nosso calculo será exibido
					tudo que você ira precisar para que seu churrasco seja realizado
					com sucesso.</h5>
					
					<small class="text-muted"><a href="${calculo}"
									class="btn btn-primary btn-sm">Calcular</a>
									</small>
		</div>
	</div>
</main>


<footer class="footer">
	<div class="container">
		<span class="text-muted">Churradega - 2020 - Desenvolvido por:
			Marcelo / Alana / Rodrigo
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