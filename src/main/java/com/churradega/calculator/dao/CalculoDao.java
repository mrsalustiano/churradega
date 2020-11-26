package com.churradega.calculator.dao;

import java.util.List;

import com.churradega.calculator.domain.Calculo;

public interface CalculoDao {

	void save(Calculo calculo);

	void update(Calculo calculo);

	Calculo findById(Long id);

	void delete(Long id);

	List<Calculo> findAll();
}
