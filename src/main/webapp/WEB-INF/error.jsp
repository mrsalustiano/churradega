<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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

h4 {
	text-align: center;
}

h3 {
	font-style: normal;
	font-weight: normal;
}
</style>



<title>Erro</title>

</head>
<body>

	<div class="container mt-5 col-5">
		<div class="row" ></div>
		<div class="row ">
			<div class="col-lg-12">
				<div class="jumbotron">
					<h4>
						<span>Código do Erro : ${status} </span>
					</h4>
					<h3><span>"${error}</span></h3>




					<div class="col-lg-12">
						<span>${message}</span><br/><br/> 
						<a class="btn btn-primary"
							type="button" href="javascript:history.back()">Voltar a
							página anterior</a>
					</div>

				</div>
			</div>
		</div>
	</div>
	<div></div>
	<script type="text/javascript" src='<spring:url value="https://code.jquery.com/jquery-3.5.1.slim.min.js" />'></script>
	<script type="text/javascript" src='<spring:url value="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" />'></script>
	<script type="text/javascript" src='<spring:url value="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"  />'></script>
</body>
</html>

