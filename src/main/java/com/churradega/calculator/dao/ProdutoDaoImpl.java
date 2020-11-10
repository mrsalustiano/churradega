package com.churradega.calculator.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.churradega.calculator.domain.Produto;

@Repository
public class ProdutoDaoImpl extends AbstractDao<Produto, Long> implements ProdutoDao {

	@Override
	public List<Produto> findByCategoria(String categoria) {
		
		return createQuery("select p from Produto where p.categoria = ?1", categoria);
	}

	@Override
	public List<Produto> findByNome(String nome) { 
		
		return createQuery("select p from Produto where p.nome = ?1", nome);
	}

}
