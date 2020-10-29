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
<spring:url value="/clientes/salva" var="salva"></spring:url>

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
	background-image: url("../images/fundo.png");
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
		<h2>Cadastro de Clientes</h2>
		<img src="../images/cadCliente.png" width="150" height="150">
	</div>
	<hr>
	<div class="container">
		<form:form action="${salva}" method="POST" modelAttribute="cliente">
			<form:hidden path="id" />

			<div class="form-row">
				<div class="col-12">
					<c:if test="${not empty mensagemErro }">
						<div id="divMensagemErro" class="alert alert-danger" role="alert">${mensagemErro}</div>
					</c:if>

					<c:if test="${not empty mensagemSucesso }">
						<div id="divMensagemSucesso" class="alert alert-success"
							role="alert">${mensagemSucesso}</div>
					</c:if>
				</div>
			</div>

			<div class="form-row">
				<div class="form-group col-md-8">
					<label for="inputNome">Nome</label>
					<form:input type="text" path="nome" class="form-control"
						id="inputNome" placeholder="Nome" />


				</div>
				<div class="form-group col-md-4">
					<label for="inputCPF">CPF</label>
					<form:input type="text" class="form-control" id="cpf"
						onkeypress="$(this).mask('000.000.000-00')" placeholder="CPF"
						path="cpf" />


				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-4">
					<label for="inputDTNasc">Data de Nascimento</label>
					<form:input type="date" path="dataNascimento" class="form-control"
						id="inputDTNasc" />
				</div>
				<div class="form-group col-md-8">
					<label for="inputEmail">Email</label>
					<form:input type="email" path="email" class="form-control"
						id="inputEmail" placeholder="Digite o email" />
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputPasswd1">Senha </label>
					<form:input type="password" path="senhaCliente"
						class="form-control" id="inputPasswd1"
						placeholder="Digite a senha" />
				</div>
				<div class="form-group col-md-6">
					<label for="inputPasswd2">Repita a Senha </label>
					<form:input type="password" class="form-control" id="inputPasswd2"
						path="senhaCliente2" placeholder="Repita a senha" />
				</div>
			</div>
			<div class="d-flex justify-content-center">
				<button type="submit" class="btn btn-primary">Cadastrar</button>
				&nbsp;&nbsp;
				<button type="reset" class="btn btn-danger">Cancelar</button>
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