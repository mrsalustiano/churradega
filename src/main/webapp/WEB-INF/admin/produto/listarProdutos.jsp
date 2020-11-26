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
<spring:url value="/admin/produtos/deleta/" var="deleta"></spring:url>
<spring:url value="/admin/produtos/altera/" var="altera"></spring:url>

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

label {
	text-align: center;
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

			<div class="panel-footer text-center bg-dark purple-gradient">
				<span class="m-0 text-center text-white" style="font-size: 20px">Listagem
					de Produtos</span>
			</div>

			<hr>

			<div class="col-9">
				<c:if test="${not empty mensagemErro }">
					<div id="divMensagemErro" class="alert alert-danger" role="alert">${mensagemErro}</div>
				</c:if>

				<c:if test="${not empty mensagemSucesso }">
					<div id="divMensagemSucesso" class="alert alert-success"
						role="alert">${mensagemSucesso}</div>
				</c:if>
			</div>

			<c:if test="${not empty produtos}"></c:if>
			<table class="table table-sm table-striped">
				<thead class="thead">
					<tr>
						<th scope="col">Codigo</th>
						<th scope="col">Nome</th>
						<th scope="col">Categoria</th>
						<th scope="col">Descricao</th>
						<th scope="col">Valor</th>
						<th scope="col" colspan="2">Ações</th>

					</tr>
				</thead>
				<tbody>
					<c:forEach var="produto" items="${produtos}">
						<tr>
							<td>${produto.id}</td>
							<td>${produto.nome}</td>
							<td>${produto.categoria}</td>
							<td>${produto.descricao}</td>
							<td>${produto.valor } </td>
							<td><c:if test="${produto.imagemProduto  != null }">
									<input type="checkbox" checked="checked" disabled="disabled">
								</c:if> <c:if test="${produto.imagemProduto  == null }">
									<input type="checkbox" disabled="disabled">
								</c:if></td>

							<td><a href="${altera}${produto.id}" class="btn btn-info">Alterar</a></td>
							<td><a href="#" class="btn btn-danger"
								data-href="${deleta}${produto.id}" data-toggle="modal"
								data-target="#confirm-delete">Apagar</a><br></td>
						</tr>

					</c:forEach>
				</tbody>
			</table>
			<button class="btn btn-success" type="button"
				onclick="javascript:history.back()">Voltar</button>
		</div>
	</div>

	<div class="modal fade" id="confirm-delete" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">

				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true"></button>
					<h4 class="modal-title" id="myModalLabel">Confirmar Remoção</h4>
				</div>

				<div class="modal-body">
					<p>Você está prestes a excluir o registro , esse procedimento é
						irreversível!</p>
					<p>Deseja prosseguir?</p>

				</div>

				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
					<a class="btn btn-danger btn-ok">Delete</a>
				</div>
			</div>
		</div>

	</div>
	
	

<script type="text/javascript"
		src='<spring:url value="https://code.jquery.com/jquery-3.5.1.slim.min.js" />'></script>
	<script type="text/javascript"
		src='<spring:url value="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" />'></script>
	<script type="text/javascript"
		src='<spring:url value="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"  />'></script>





<script type="text/javascript">
		$(document).ready(function() {
			//na div de id (#) divMensagemErro
			//terá uma espera (delay) de 5 secs (5000ms)
			//será feito um fadeOut lento (frescura)
			$('#divMensagemErro').delay(5000).fadeOut('slow');
			$('#divMensagemSucesso').delay(5000).fadeOut('slow');
		});
	</script>
	<script>
		$('#confirm-delete').on(
				'show.bs.modal',
				function(e) {
					$(this).find('.btn-ok').attr('href',
							$(e.relatedTarget).data('href'));

					$('.debug-url').html(
							'Delete URL: <strong>'
									+ $(this).find('.btn-ok').attr('href')
									+ '</strong>');
				});
	</script>
</main>
<footer class="footer">
	<div class="container">
		<span class="text-muted">Churradega - 2020 - Desenvolvido por:
			Marcelo / Alana / Rodrigo
		</span>
	</div>
</footer>


</body>
</html>