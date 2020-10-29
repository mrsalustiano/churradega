package com.churradega.calculator.service.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	
	@RequestMapping("/")
	public String IndexPagina() {
		return "index";

	}
	
	@RequestMapping("/cadastro")
	public String CadastroPagina() {
		return "/cliente/cadastro";

	}
	
	@RequestMapping("/calculo")
	public String calculoPagina() {
		return "calculo";

	}
	
	
	
	
	@RequestMapping("menu")
	public String CabecalhoPrincipal() {
		return "fragments/menu";
		
	}
	
	

}
