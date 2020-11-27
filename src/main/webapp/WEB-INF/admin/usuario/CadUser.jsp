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
<spring:url value="/admin/usuarios/salva" var="salva"></spring:url>

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

label {
	text-align: center;
}
</style>

</head>
<header>
	<jsp:include page="/admin/menuAdmin"></jsp:include>
</header>
<main>

	<div class="container">
		<h2>Cadastro de Usuário</h2>
		<img src="../../images/cadCliente.png" width="150" height="150">
	</div>
	<hr>
	<div class="container">
		<form:form action="${salva}" method="POST" modelAttribute="usuario">
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
				<div class="form-group col-md-4">
					<label for="inputNome">Nome</label>
					<form:input type="text" class="form-control" id="inputNome"
						placeholder="Nome" path="nome" />

				</div>
				<div class="form-group col-md-4">
					<label for="inputLogin">Login</label>
					<form:input type="text" class="form-control" id="inputLogin"
						placeholder="Login" path="login" />

				</div>

				<div class="form-group col-md-4">
					<label for="inputPerfil">Perfil</label>
					<div class="form-row">
						<form:select path="perfil" class="form-control">
							<form:option value="none" label="Select" />
							<form:option value="ROLE_ADMIN" label="ADMIN" />
							<form:option value="ROLE_USER" label="USER" />
						</form:select>
					</div>
				</div>

			</div>
			<div class="form-row">
				<div class="form-group col-md-2">
					<label for="inputDTCadastro">Data de Cadastro</label>
					<form:input type="date" class="form-control" id="inputDTCadastro"
						path="dataCadastro" />
				</div>

				<div class="form-group col-sm-1 ">
					<label for="inputAtivo">Ativo</label>
					<div class="form-row"></div>
					<form:checkbox class="form-control" path="ativo" />

				</div>


				<div class="form-group col-md-4 ">
					<label for="inputPasswd1">Senha </label>
					<form:input type="password" class="form-control" id="inputPasswd1"
						placeholder="Digite a senha" path="senha" />
				</div>

				<div class="form-group col-md-1"></div>

				<div class="form-group col-md-3">
					<label for="inputPasswd2">Repita a Senha </label>
					<form:input type="password" class="form-control" id="inputPasswd2"
						placeholder="Repita a senha" path="senhaValidacao" />
				</div>

			</div>
			<div class="d-flex justify-content-center">
				<button type="submit" class="btn btn-primary">Cadastrar</button>
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