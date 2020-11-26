package com.churradega.calculator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.churradega.calculator.dao.CalculoDao;
import com.churradega.calculator.domain.Calculo;

@Service
public class CalculoServiceImpl implements CalculoService {

	@Autowired
	private CalculoDao dao;
	
	@Override
	@Transactional
	public void save(Calculo calculo) {
		dao.save(calculo);

	}

	@Override
	@Transactional
	public void update(Calculo calculo) {
		dao.update(calculo);

	}

	@Override
	public Calculo findById(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		dao.delete(id);

	}

	@Override
	public List<Calculo> findAll() {
		return dao.findAll();
	}
}
