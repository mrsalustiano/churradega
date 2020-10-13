package com.churradega.calculator.service.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	@RequestMapping("admin/")
	public String IndexPaginaAdmin() {
		return "admin/indexAdmin";
	}
	
	@RequestMapping("admin")
	public String IndexPaginaAdminSemBarra() {
		return "admin/indexAdmin";
	}

	@RequestMapping("admin/produto/cadastrar")
	public String ProdutoCadastro() {
		return "admin/produto/cadastro";
	}

	@RequestMapping("admin/produto/editar")
	public String ProdutoEditar() {
		return "admin/produto/editar";
	}

	@RequestMapping("admin/produto/listar")
	public String ProdutoListar() {
		return "admin/produto/lista";
	}

	@RequestMapping("admin/cliente/editar")
	public String ClienteEditar() {
		return "admin/cliente/editar";
	}
	
	@RequestMapping("admin/cliente/listar")
	public String ClienteListar() {
		return "admin/cliente/lista";
	}

	@RequestMapping("admin/pedido/listar")
	public String PedidoListar() {
		return "admin/pedido/lista";
	}

	@RequestMapping("admin/pedido/editar")
	public String PedidoEditar() {
		return "admin/pedido/lista";
	}


	@RequestMapping("admin/usuario/cadastrar")
	public String UsuarioCadastro() {
		return "admin/usuario/cadastro";
	}

	@RequestMapping("admin/usuario/editar")
	public String UsuarioEditar() {
		return "admin/usuario/editar";
	}

	@RequestMapping("admin/usuario/listar")
	public String UsuarioListar() {
		return "admin/usuario/lista";
	}

	
}
