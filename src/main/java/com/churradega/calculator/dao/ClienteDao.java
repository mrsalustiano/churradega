package com.churradega.calculator.dao;

import java.time.LocalDate;
import java.util.List;

import com.churradega.calculator.domain.Cliente;

public interface ClienteDao {

	void save(Cliente cliente);

	void update(Cliente cliente);

	Cliente findById(Long id);

	void delete(Long id);

	List<Cliente> findAll();

	List<Cliente> findByEmail(String email);

	List<Cliente> findByCpf(String cpf);
	
	List<Cliente> findByEmailAndSenhaCliente(String email, String password);
	
	List<Cliente> findByDataNascimento(LocalDate dataNasc);

}
