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
	<jsp:include page="${request.contextPath}/menu"></jsp:include>
</header>
<main>
	<div class="container">
		<h2>Coloque abaixo as quantidades de pessoas</h2>
		<form:form action="${salva}" method="POST" modelAttribute="calculo"
			cssClass="mb-2">
			<form:hidden path="id" />
			<div class="card-deck">
				<div class="card" style="width: 14rem;">
					<img src="images/avt-homem.jpg" class="card-img-top" alt="homens">
					<div class="card-body">
						<h5 class="card-title">Homens</h5>
						<p class="card-text">
						<div class="form-group">
							<div class="form-check">
								<form:checkbox class="form-check-input" path="homemGlutao"
									id="glutaoHomemCheck" />
								<label class="form-check-label" for="glutaoHomemCheck">
									Glutão ? </label>
							</div>
						</div>

						</p>
						<p class="card-text">
						<div class="form-group row">
							<label for="inputHomem" class="col-sm-6 col-form-label"><strong>
									Quantidade</strong></label>
							<div class="col-sm-6">
								<form:input type="number" path="qtdHomem" min="0" max="99"
									class="form-control" id="inputHomem" />
							</div>
						</div>
						</p>
					</div>
				</div>
				<div class="card" style="width: 14rem;">
					<img src="images/avt-mulher.jpg" class="card-img-top" alt="mulher">
					<div class="card-body">
						<h5 class="card-title">Mulheres</h5>
						<p class="card-text">
						<div class="form-group">
							<div class="form-check">
								<form:checkbox var="mulherGlutao" class="form-check-input"
									path="mulherGlutao" id="glutaoMulherCheck" />
								<label class="form-check-label" for="glutaoMulherCheck">
									Glutão ? </label>
							</div>
						</div>


						</p>
						<p class="card-text">
						<div class="form-group row">
							<label for="inputMulher" class="col-sm-6 col-form-label"><strong>
									Quantidade</strong></label>
							<div class="col-sm-6">
								<form:input type="number" min="0" max="99" class="form-control"
									id="inputMulher" path="qtdMulheres" />
							</div>
						</div>
						</p>
					</div>
				</div>
				<div class="card" style="width: 14rem;">
					<img src="images/avt-crianca.png" class="card-img-top"
						alt="Criança">
					<div class="card-body">
						<h5 class="card-title">Crianças</h5>
						<p class="card-text"></p>
						<p class="card-text">
						<div class="form-group row">
							<label for="inputCrianca" class="col-sm-6 col-form-label"><strong>
									Quantidade</strong></label>
							<div class="col-sm-6">
								<form:input type="number" min="0" max="99" class="form-control"
									path="qtdCrianca" id="inputCrianca" />
							</div>
						</div>
						</p>
					</div>
				</div>
			</div>
			<div class="d-flex justify-content-center">
				<button type="submit" class="btn btn-primary">Calcular</button>
				&nbsp;&nbsp;
				<button type="reset" class="btn btn-danger">Cancelar</button>
				&nbsp;&nbsp;
				<button class="btn btn-success" type="button"
					onclick="javascript:history.back()">Voltar</button>
			</div>
		</form:form>
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