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


	@RequestMapping("menuAdmin")
	public String CabecalhoPrincipal() {
		return "fragments/menuAdmin";
	}
}
