package com.churradega.calculator.service.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/calculo")
public class CalculoController {

	

	
	@RequestMapping("")
	public String calculoPagina() {
		return "calculo";

	}
	
	@RequestMapping("calcular")
	public String Calcular( ) {
		
		
		
		return "redirect:/calculo/mostrar";
	}
}
