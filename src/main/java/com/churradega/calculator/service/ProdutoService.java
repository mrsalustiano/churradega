package com.churradega.calculator.service;

import java.util.List;

import com.churradega.calculator.domain.Produto;

public interface ProdutoService {
	
	public void save(Produto produto);
	
	public void update(Produto produto);
	
	public void delete(Long id);
	
	Produto findById(Long id);

	List<Produto> findAll();
	
	List<Produto> findByCategoria(String categoria);
	
	List<Produto> findByNome(String nome);
	
	
	
	
	
	

}
