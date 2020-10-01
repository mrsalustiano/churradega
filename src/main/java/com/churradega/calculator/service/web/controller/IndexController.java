package com.churradega.calculator.service.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	
	@RequestMapping("/")
	public String IndexPagina() {
		
		return "index";

	}
	
	
	
	@RequestMapping("cabecalhoPrincipal")
	public String CabecalhoPrincipal() {
		return "fragments/cabecalho";
	}
	
	@RequestMapping("footerPrincipal")
	public String FooterPrinicpal() {
		return "fragments/footer";
	}

}
