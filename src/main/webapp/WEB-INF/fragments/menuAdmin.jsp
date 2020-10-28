<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <header>
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
                            <a class="dropdown-item" href="#">Editar</a>
                            <a class="dropdown-item" href="#">Listar</a>
                        </div>
                    </li>

                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Clientes</a>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="#">Editar</a>
                            <a class="dropdown-item" href="#">Listar</a>

                        </div>
                    </li>

                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Pedidos</a>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="#">Listar</a>
                            <a class="dropdown-item" href="#">Editar</a>
                        </div>
                    </li>

                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Usuários</a>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="${usuarios }">Cadastrar</a>
                            <a class="dropdown-item" href="#">Editar</a>
                            <a class="dropdown-item" href="#">Listar</a>
                        </div>
                    </li>

                </ul>
                <i class="fas fa-user-shield"></i>
                <span class="navbar-text">
               <a class="nav-link" href="#"> Área Adminstrativa </a>
              </span>
            </div>
        </nav>
        </header>
</body>
</html>