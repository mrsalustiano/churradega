package com.churradega.calculator.service.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

	
	@RequestMapping("/")
	public String IndexPaginaAdmin() {
		return "admin/indexAdmin";
	}
	
	@RequestMapping("")
	public String IndexPaginaAdminSemBarra() {
		return "admin/indexAdmin";
	}
	
	//b produto

	@RequestMapping("produto/cadastrar")
	public String ProdutoCadastro() {
		return "admin/produto/cadProd";
	}

	@RequestMapping("produto/editar")
	public String ProdutoEditar() {
		return "admin/produto/cadEdit";
	}

	@RequestMapping("produto/listar")
	public String ProdutoListar() {
		return "admin/produto/cadLista";
	}

	//cliente 
	@RequestMapping("cliente/editar")
	public String ClienteEditar() {
		return "admin/cliente/cadEdit";
	}
	
	@RequestMapping("cliente/listar")
	public String ClienteListar() {
		return "admin/cliente/lista";
	}
	
	// pedido

	@RequestMapping("pedido/listar")
	public String PedidoListar() {
		return "admin/pedido/lista";
	}

	@RequestMapping("pedido/editar")
	public String PedidoEditar() {
		return "admin/pedido/lista";
	}



	
}
