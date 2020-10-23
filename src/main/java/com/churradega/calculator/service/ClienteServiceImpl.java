package com.churradega.calculator.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.churradega.calculator.dao.ClienteDao;
import com.churradega.calculator.domain.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteDao dao;

	@Override
	@Transactional
	public void save(Cliente cliente) {
		dao.save(cliente);

	}

	@Override
	@Transactional
	public void update(Cliente cliente) {
		dao.update(cliente);

	}

	@Override
	public Cliente findById(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		dao.delete(id);

	}

	@Override
	public List<Cliente> findAll() {
		return dao.findAll();
	}

	@Override
	public List<Cliente> findByEmail(String email) {
		return dao.findByEmail(email);
	}

	@Override
	public List<Cliente> findByCpf(String cpf) {
		return dao.findByCpf(cpf);
	}

	@Override
	public List<Cliente> findByEmailAndSenhaCliente(String email, String password) {
		return dao.findByEmailAndSenhaCliente(email, password);
	}

	@Override
	public List<Cliente> findByDataNascimento(LocalDate dataNasc) {
		return dao.findByDataNascimento(dataNasc);
	}

}
