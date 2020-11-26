<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<spring:url value="/" var="home"></spring:url>
<spring:url value="/admin/produtos/cadastrar" var="produtos"></spring:url>
<spring:url value="/admin/produtos/listar" var="listarProduto"></spring:url>
<spring:url value="/clientes/listar" var="listarCliente"></spring:url>
<spring:url value="/admin/pedido/listar" var="listarPedido"></spring:url>
<spring:url value="/admin/usuarios/cadastrar" var="usuariosCadastro"></spring:url>
<spring:url value="/admin/usuarios/listar" var="listarUsuario"></spring:url>
<spring:url value="/admin/" var="adminArea"></spring:url>



<!DOCTYPE html>
<body>

        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">Churradega</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarText">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="/"><i class="fas fa-home"></i>&nbsp;Home </a>
                    </li>

                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Produtos</a>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="${produtos}">Cadastrar</a>
                            <a class="dropdown-item" href="${listarProduto }">Listar</a>
                        </div>
                    </li>

                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Clientes</a>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="${listarCliente}">Listar</a>

                        </div>
                    </li>

                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Pedidos</a>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="#">Listar</a>
                        </div>
                    </li>

                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Usuários</a>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="${usuariosCadastro }">Cadastrar</a>
                            <a class="dropdown-item" href="${listarUsuario }">Listar</a>
                        </div>
                    </li>

                </ul>
                <i class="fas fa-user-shield"></i>
                <span class="navbar-text">
               <a class="nav-link" href="${adminArea}"> Área Adminstrativa </a>
              </span>
            </div>
        </nav>
 
</body>