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
<spring:url value="/admin/produtos/salva" var="salva"></spring:url>
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

h5 {
	font-style: normal;
	font-weight: normal;
}
</style>

</head>
<header>
	<jsp:include page="/admin/menuAdmin"></jsp:include>
</header>
<main>



<div class="container mt-5 ">
		<br>


		<div class="container mb-5">
			<div class="row">
				<div class="col-md-8 offset-md-2">
				<div class="panel-footer text-center bg-dark purple-gradient">
						<span class="m-0 text-center text-white" style="font-size:20px"> Cadastro de Produtos</span>
					</div>

					<form:form action="${salva}" method="POST" modelAttribute="produto" enctype="multipart/form-data" cssClass="mb-2">
					<form:hidden path="id" />
					<form:hidden path="imagemProduto" />
						<div class="col-12">
							<c:if test="${not empty mensagemErro }">
								<div id="divMensagemErro" class="alert alert-danger" role="alert">${mensagemErro}</div>
							</c:if>
			
							<c:if test="${not empty mensagemSucesso }">
								<div id="divMensagemSucesso" class="alert alert-success" role="alert">${mensagemSucesso}</div>
							</c:if>
						</div>				
					
						<div class="form-row">
							<div class="form-group col-md-12">
								<label for="inputNome">Nome</label> 
								<form:input path="nome" type="text" class="form-control" id="inputNome" placeholder="Nome" />
							</div>
					
						</div>


						<div class="input-group mb-3">
							<div class="input-group-prepend">
								<span class="input-group-text">Upload Foto</span>
							</div>
							<div class="custom-file">
								<input type="file" class="custom-file-input" name="imagem" value="${produto.imagemEncoded }" id="inputFoto">
								<label class="custom-file-label" for="inputFoto">Escolha
									uma Foto</label>
							</div>
						</div>
	
						
					<c:if test="${produto.id ne null}">
				
						<!-- a imagem será exibida somente no carregaAlterar -->
						<div class="mb-5">
							<c:choose>
									<c:when test="${produto.imagemEncoded ne null }">
										<a href="#"><img class="img-thumbnail" src="data:image/jpge;base64,${produto.imagemEncoded}" alt=""></a>
									</c:when>
									</c:choose>
									<c:choose>
									<c:when test="${produto.imagemEncoded == '' }">
										<a href="#"><img class="img-thumbnail" src="../../../images/no-img.jpg" alt="imagem não encontrada"></a>
									</c:when>
								</c:choose>
						</div>
					</c:if>
					
					
					
						<div class="form-row">
							<div class="form-group col-md-2">
							<label for="inputCategoria">Categoria</label>
								<div class="form-row">
								<form:select path="categoria" class="form-control">
								<form:option value="none" label="Select" />
								<form:option value="CARNES" label="Carnes" />
								<form:option value="BEBIDAS" label="Bebidas" />
								<form:option value="OUTROS" label="Outros" />
								
						</form:select>
					</div>
										

							</div>
							<div class="form-group col-md-8">
								<label for="descricao">Descrição</label> <form:input type="text" path="descricao"
									class="form-control" id="descricao"/>
							</div>
							<div class="form-group col-md-2">
								<label for="valor">Valor</label> <form:input type="number" path="valor" min="0" step="0.01" 
									 class="form-control" id="valor"/>
							</div>
						</div>

											<button type="submit" class="btn btn-primary">Salvar</button>
						<button class="btn btn-danger" type="reset">Cancelar</button>
						<button class="btn btn-success" type="button" onclick="javascript:history.back()">Voltar</button>
				
					</form:form>
					
					
					<div class="row">
						<div class="col-md-10 ">
							<c:if test="${not empty produtos}"></c:if>
							<table class="table table-striped">
								<thead class="thead">
									<tr>
										<th scope="col">Codigo</th>
										<th scope="col">Nome</th>
										<th scope="col">Descrição</th>
										<th scope="col">Categoria</th>
										<th scope="col">Valor</th>
										
									</tr>
								</thead>
								<tbody>
									<c:forEach var="produto" items="${produtos}">
										<tr>
											<td>${produto.id}</td>
											<td>${produto.nome}</td>
							
											<td>${produto.descricao}</td>
											<td>${produto.categoria}</td>
											<td>${produto.valor}</td>
											
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>

				</div>
			</div>
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