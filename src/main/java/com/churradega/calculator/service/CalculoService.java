package com.churradega.calculator.service;

import java.util.List;

import com.churradega.calculator.domain.Calculo;

public interface CalculoService {

	void save(Calculo calculo);

	void update(Calculo calculo);

	Calculo findById(Long id);

	void delete(Long id);

	List<Calculo> findAll();

}
