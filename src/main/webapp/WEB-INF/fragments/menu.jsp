<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<spring:url value="/" var="home"></spring:url>
<spring:url value="/clientes/cadastrar" var="cadastro"></spring:url>
<spring:url value="/calculo" var="calculo"></spring:url>
<!DOCTYPE html>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">Churradega</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarText" aria-controls="navbarText"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarText">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="${home}"><i
						class="fas fa-home"></i>&nbsp;Home <span class="sr-only">(current)</span></a>
				</li>
				<li class="nav-item active"><a class="nav-link"
					href="${cadastro }"><i class="fas fa-user-cog"></i> Cadastro</a></li>
				<li class="nav-item active"><a class="nav-link"
					href="${calculo}"><i class="fas fa-calculator"></i>&nbsp;Cálculo</a>
				</li>
			</ul>
			<!--
			<i class="fas fa-user-edit"></i>
			 <span>
			<a class="nav-link" href="#">Editar seus dados</a>
			</span>  
			<i class="fa fa-sign-out" aria-hidden="true"></i> <span>
			<a class="nav-link" href="#"> Sair</a>
			</span>
			-->
			<i class="fas fa-user-shield"></i> <span class="navbar-text">
				<a class="nav-link" href="/admin"> Área Adminstrativa </a>
			</span>
		</div>
	</nav>

</body>
