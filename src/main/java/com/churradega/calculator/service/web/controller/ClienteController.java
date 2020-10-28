package com.churradega.calculator.service.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.churradega.calculator.domain.Cliente;
import com.churradega.calculator.service.ClienteService;
import com.churradega.calculator.utils.Validations;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteService service;

	@GetMapping("")
	public String cadastrarL(Cliente cliente, ModelMap model) {
		model.addAttribute("clientes", service.findAll());

		return "cliente/cadCli";
	}

	@GetMapping("/cadastrar")
	public String cadastrar(Cliente cliente, ModelMap model) {
		model.addAttribute("clientes", service.findAll());

		return "cliente/cadCli";
	}

	@GetMapping("/listar")
	public String listar(ModelMap model) {

		model.addAttribute("clientes", service.findAll());

		return "cliente/listarCliente";
	}

	@Transactional
	@RequestMapping("/salva")
	public String salvar(@ModelAttribute Cliente clientes, RedirectAttributes attr) {

		Long valor = clientes.getId();

		if (clientes.getDataNascimento() != null) {
			if (!(Validations.ValidaIdade(clientes.getDataNascimento()))) {
				attr.addFlashAttribute("mensagemErro", "ERRO GRAVE: A idade tem que ser maior que 18 anos completos");
				return "redirect:/clientes/cadastrar";

			}
		} else {
			attr.addFlashAttribute("mensagemErro", "ERRO GRAVE: A idade não pode ser nula");
			return "redirect:/clientes/cadastrar";
		}

		if (!(Validations.ValidaCPF((clientes.getCpf())))) {
			attr.addFlashAttribute("mensagemErro", "ERRO GRAVE: CPF Inválido");
			return "redirect:/clientes/cadastrar";

		}

		if (!(Validations.isValidEmailAddress(clientes.getEmail()))) {
			attr.addFlashAttribute("mensagemErro", "ERRO GRAVE: Email Inválido");
			return "redirect:/clientes/cadastrar";
		}

		if (!(Validations.ValidaSenha(clientes.getSenhaCliente(), clientes.getSenhaCliente2()))) {
			attr.addFlashAttribute("mensagemErro", "ERRO GRAVE: Senhas Não Confere");
			return "redirect:/clientes/cadastrar";
		}

		if (valor == null) {
			service.save(clientes);
			attr.addFlashAttribute("mensagemSucesso", "Cliente adicionado com sucesso");
		} else {
			service.update(clientes);
			attr.addFlashAttribute("mensagemSucesso", "Cliente editado com sucesso");
		}

		return "redirect:/clientes/cadastrar";
	}

	@PostMapping("/editar")
	public String editar(@Validated Cliente cliente, BindingResult result) {

		if (result.hasErrors()) {
			return "cliente/cadCli";
		}

		service.update(cliente);

		return "redirect:/clientes/cadastro";
	}

	@GetMapping("/deleta/{id}")
	@Transactional
	public String deleta(@PathVariable(name = "id") Long id, RedirectAttributes attr) {

		service.delete(id);
		attr.addFlashAttribute("mensagemSucesso", "Cliente removido com sucesso");
		return "redirect:/clientes/listar";

	}

	@GetMapping("/altera/{id}")
	public String carregaAlterar(@PathVariable(name = "id") Long id, Model model, RedirectAttributes attr) {
		try {

			Cliente cliente = service.findById(id);
			model.addAttribute("clientes", service.findAll());
			model.addAttribute("cliente", cliente);

		} catch (Exception e) {
			attr.addFlashAttribute("mensagemErro", "ERRO GRAVE: " + e.getMessage());

		}
		return "cliente/cadCli";

	}

}
