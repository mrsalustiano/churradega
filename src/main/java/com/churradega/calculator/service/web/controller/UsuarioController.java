package com.churradega.calculator.service.web.controller;

import java.time.LocalDate;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.churradega.calculator.domain.Usuario;
import com.churradega.calculator.service.UsuarioService;
import com.churradega.calculator.utils.Validations;


@Controller
@RequestMapping("/admin/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("")
	public String cadastrarL(Usuario usuario, ModelMap model) {
		model.addAttribute("usuarios", usuarioService.findAll());
		
		return "admin/usuario/CadUser";
	}
	
	@GetMapping("/cadastrar")
	public String cadastrar(Usuario usuario, ModelMap model) {
		model.addAttribute("usuarios", usuarioService.findAll());
		
		return "admin/usuario/CadUser";
	}
	
	
	@GetMapping("/listar")
	public String listar(ModelMap model	) {
		model.addAttribute("usuarios", usuarioService.findAll());
		
		return "admin/usuario/listarUsuario";
	}
	

	@Transactional
	@RequestMapping("/salva")
	public String salvar(@ModelAttribute Usuario usuario, RedirectAttributes attr ) {
		
		LocalDate dataAtual = LocalDate.now();
		LocalDate dataSistema = usuario.getDataCadastro();
		
		if (!(dataSistema.equals(dataAtual))) {
			attr.addFlashAttribute("mensagemErro", "ERRO GRAVE: A data de cadastro não pode ser diferente da data atual");
			return "redirect:/admin/usuarios/cadastrar";
		}

		if (!(Validations.ValidaSenha(usuario.getSenha(), usuario.getSenhaValidacao()))) {
			attr.addFlashAttribute("mensagemErro", "ERRO GRAVE: Senhas Não Confere");
			return "redirect:/admin/usuarios/cadastrar";
		}
		
        
		
		if (!(usuario.getPerfil().equals("ROLE_ADMIN") || usuario.getPerfil().equals("ROLE_USER"))) {
			attr.addFlashAttribute("mensagemErro", "ERRO GRAVE: Perfil deve ser preenchido");
			return "redirect:/admin/usuarios/cadastrar";
		}
		
		
		
		Long valor = usuario.getId();
		if (valor == null) {
			String usuarioCadastro = usuario.getLogin();
			
			if  (!(usuarioService.findByLogin(usuarioCadastro).isEmpty())) {
				attr.addFlashAttribute("mensagemErro", "ERRO GRAVE: LOGIN já cadastro");
				return "redirect:/admin/usuarios/cadastrar";
			}
			
			usuarioService.save(usuario);
			attr.addFlashAttribute("mensagemSucesso", "Usuario adicionado com sucesso");	
		} else {
			usuarioService.update(usuario);
			attr.addFlashAttribute("mensagemSucesso", "Usuario editado com sucesso");
		}
		
		
		return "redirect:/admin/usuarios/cadastrar";
	}
	
	
	@PostMapping("/editar")
	public String editar(@Valid Usuario usuario, BindingResult result) {
	usuarioService.update(usuario);
		
		return "redirect:/admin/usuarios/cadastro";
	}
	
	
	@GetMapping("/deleta/{id}")
	@Transactional
	public String deleta(@PathVariable(name = "id") Long id, RedirectAttributes attr) {
	
		usuarioService.delete(id);
		attr.addFlashAttribute("mensagemSucesso", "Usuario removido com sucesso");
		return "redirect:/admin/usuarios/listar";
		
	}
	
	@GetMapping("/altera/{id}")
	public String carregaAlterar(@PathVariable(name = "id") Long id, Model model, RedirectAttributes attr) {
		try {

			Usuario usuario = usuarioService.findById(id);
			model.addAttribute("usuarios", usuarioService.findAll());
			model.addAttribute("usuario", usuario);

		} catch (Exception e) {
			attr.addFlashAttribute("mensagemErro", "ERRO GRAVE: " + e.getMessage());

		}
		return "admin/usuario/CadUser";
	
	}
	
}
