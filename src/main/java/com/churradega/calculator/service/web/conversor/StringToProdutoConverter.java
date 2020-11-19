package com.churradega.calculator.service.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.churradega.calculator.domain.Produto;
import com.churradega.calculator.service.ProdutoService;


@Component
public class StringToProdutoConverter implements Converter<String , Produto>{

	@Autowired
	private ProdutoService service;
	
	@Override
	public Produto convert(String text) {
		if (text.isEmpty()) {
			return null;
		}
		Long id = Long.valueOf(text);
		return service.findById(id);
	}
}
