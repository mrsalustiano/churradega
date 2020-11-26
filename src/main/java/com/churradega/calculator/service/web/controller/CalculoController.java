package com.churradega.calculator.service.web.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.churradega.calculator.domain.Calculo;
import com.churradega.calculator.domain.Cliente;
import com.churradega.calculator.service.CalculoService;
import com.churradega.calculator.utils.Validations;

@Controller
@RequestMapping("/calculo")
public class CalculoController {

	@Autowired
	private CalculoService service;

	@GetMapping("")
	public String cadastrarL(Calculo Calculo, ModelMap model) {
		model.addAttribute("Calculos", service.findAll());

		return "calculo";
	}
	

	@GetMapping("/cadastrar")
	public String cadastrar(Calculo Calculo, ModelMap model) {
		model.addAttribute("Calculos", service.findAll());

		return "calculo";
	}

	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("Calculos", service.findAll());

		return "listarCalculo";
	}

	
	@Transactional
	@RequestMapping("/salva")
	public String salvar(@ModelAttribute Calculo calculos, RedirectAttributes attr) {

		Double carnes = 0.0;
		Double bebidas = 0.0;
		Double refrigerantes = 0.0;
		calculos.setData(LocalDate.now());
		Long valor = calculos.getId();

		if (calculos.getHomemGlutao() == true) {
			carnes += (calculos.getQtdHomem().doubleValue() * 0.623) * 1.2;
			bebidas +=  (calculos.getQtdHomem().doubleValue() * 8) * 1.2;
			refrigerantes +=  (calculos.getQtdHomem().doubleValue() * 0.5) ;
			
		} else {
			carnes += (calculos.getQtdHomem().doubleValue() * 0.623);
			bebidas +=  (calculos.getQtdHomem().doubleValue() * 8);
			refrigerantes +=  (calculos.getQtdHomem().doubleValue() * 0.5) ;
		}

		// mulheres
		if (calculos.getMulherGlutao() == true) {
			carnes += (calculos.getQtdMulheres().doubleValue() * 0.478) * 1.2;
			bebidas +=  (calculos.getQtdMulheres().doubleValue() * 6) * 1.2;
			refrigerantes +=  (calculos.getQtdMulheres().doubleValue() * 1) ;
			
		} else {
			carnes += (calculos.getQtdMulheres().doubleValue() * 0.478);
			bebidas +=  (calculos.getQtdMulheres().doubleValue() * 6);
			refrigerantes +=  (calculos.getQtdMulheres().doubleValue() * 0.5) ;
		}
		
		
		carnes += (calculos.getQtdCrianca().doubleValue() * 0.217);
		refrigerantes +=  (calculos.getQtdCrianca().doubleValue() * 1) ;

		calculos.setQtdCarnes(carnes);
		calculos.setQtdCerveja(bebidas);
		calculos.setQtdRefrigerantes(refrigerantes);
		

		if (valor == null) {
			service.save(calculos);
			attr.addFlashAttribute("mensagemSucesso", "calculos adicionado com sucesso");
		} else {
			service.update(calculos);
			attr.addFlashAttribute("mensagemSucesso", "calculos editado com sucesso");
		}

		return "redirect:/calculo/cadastrar";
	}
	
	@GetMapping("/deleta/{id}")
	@Transactional
	public String deleta(@PathVariable(name = "id") Long id, RedirectAttributes attr) {

		service.delete(id);
		attr.addFlashAttribute("mensagemSucesso", "Cliente removido com sucesso");
		return "redirect:/clientes/listar";

	}
	
	
}
