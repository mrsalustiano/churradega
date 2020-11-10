package com.churradega.calculator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.churradega.calculator.dao.ProdutoDao;
import com.churradega.calculator.domain.Produto;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
	private ProdutoDao dao;
	
	@Override
	@Transactional
	public void save(Produto produto) {
		dao.save(produto);		
	}

	@Override
	@Transactional
	public void update(Produto produto) {
		dao.update(produto);
		
	}

	@Override
	@Transactional
	public void delete(Long id) {
		dao.delete(id);
		
	}

	@Override
	public Produto findById(Long id) {
		
		return dao.findById(id);
	}

	@Override
	public List<Produto> findAll() {
		 
		return dao.findAll();
	}

	@Override
	public List<Produto> findByCategoria(String categoria) {
	 
		return dao.findByCategoria(categoria);
	}

	@Override
	public List<Produto> findByNome(String nome) {
	 	return dao.findByNome(nome);
	}

}
