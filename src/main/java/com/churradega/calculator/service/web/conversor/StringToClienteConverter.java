package com.churradega.calculator.service.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.churradega.calculator.domain.Cliente;
import com.churradega.calculator.service.ClienteService;


@Component
public class StringToClienteConverter implements Converter<String , Cliente>{

	@Autowired
	private ClienteService service;
	
	@Override
	public Cliente convert(String text) {
		if (text.isEmpty()) {
			return null;
		}
		Long id = Long.valueOf(text);
		return service.findById(id);
	}
}
