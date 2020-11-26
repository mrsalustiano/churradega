package com.churradega.calculator.service.web.controller;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.churradega.calculator.domain.Produto;
import com.churradega.calculator.service.ProdutoService;


@Controller
@RequestMapping("/admin/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoService service;
	
	
	@GetMapping("")
	public String CadastrarL(Produto produto, ModelMap model) {
		model.addAttribute("produtos", service.findAll());
		return "admin/produto/cadProd";
	}
	
	@RequestMapping("cadastrar")
	public String Cadastrar(Produto produto, ModelMap model) {
		model.addAttribute("produtos", service.findAll());
		return "admin/produto/cadProd";
	}
	
	
	@GetMapping("listar")
	public String Listar(ModelMap model) {
		model.addAttribute("produtos", service.findAll());
		return "admin/produto/listarProdutos";
	}
	
	@RequestMapping("salva")
	@Transactional
	public String Salva(@ModelAttribute Produto produto, BindingResult result,
			@RequestParam(required=false, value="imagem") MultipartFile imagem,
			RedirectAttributes attr) {
		
		if (produto.getNome().isEmpty()) {
			attr.addFlashAttribute("mensagemErro", "ERRO GRAVE: O nome não pode ser em branco");
			return "redirect:/admin/produtos/cadastrar";
		}
		

		if (produto.getCategoria().equals("none")) {
			attr.addFlashAttribute("mensagemErro", "ERRO GRAVE: A categoria não pode ser em branco");
			return "redirect:/admin/produtos/cadastrar";
		}
		
		

		if (produto.getDescricao().isEmpty()) {
			attr.addFlashAttribute("mensagemErro", "ERRO GRAVE: A Descrição nome não pode ser em branco");
			return "redirect:/admin/produtos/cadastrar";
		}
		
		

		if (produto.getValor().doubleValue() == 0) {
			attr.addFlashAttribute("mensagemErro", "ERRO GRAVE: O Valor não pode ser Zero");
			return "redirect:/admin/produtos/cadastrar";
		}
		
		
		
		
		
		
		byte[] bImagem;
		
		try {
			if(imagem != null && imagem.getSize() > 0) {
				bImagem = imagem.getBytes();
				produto.setImagemProduto(bImagem);
			}
			Long valor = produto.getId();
			
			if (valor == null) {
				service.save(produto);
				attr.addFlashAttribute("mensagemSucesso", "Produto adicionado com sucesso");	
			} else {
				service.update(produto);
				attr.addFlashAttribute("mensagemSucesso", "Produto editado com sucesso");
			}
		} catch (Exception e) {
			attr.addFlashAttribute("mensagemErro", "ERRO GRAVE: " + e.getMessage());
		}
		
		
		return "redirect:/admin/produtos/cadastrar";
	}
	
	
	@Transactional
	@PostMapping("editar")
	public String editar(@Valid Produto produto,BindingResult result) {
		service.update(produto);		
		return "redirect:/admin/produtos/cadastrar";
	}
	
	
	@GetMapping("deleta/{id}")
	@Transactional
	public String deleta(@PathVariable(name = "id") Long id, RedirectAttributes attr) {
	
		service.delete(id);
		attr.addFlashAttribute("mensagemSucesso", "Produto removido");
		return "redirect:/admin/produtos/listar";
		
	}
	

	@RequestMapping("altera/{id}")
	public String carregaAlterar(@PathVariable(name = "id") Long id, Model model, RedirectAttributes attr) {
		
	try {
			Produto produto = service.findById(id);
			byte[] encodeBase64 = Base64.getEncoder().encode(produto.getImagemProduto());
			String base64Encoded = new String(encodeBase64, "UTF-8");
			produto.setImagemEncoded(base64Encoded);
			
			
			model.addAttribute("produtos", service.findAll());
			model.addAttribute("produto", produto);
	
			
		} catch (UnsupportedEncodingException e) {
			attr.addFlashAttribute("mensagemErro", "ERRO GRAVE: " + e.getMessage());
		}
		
		
				return "admin/produto/cadProd";
	
	}
	
	
	
}
