package com.churradega.calculator.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.churradega.calculator.domain.Cliente;

@Repository
public class ClienteDaoImpl extends AbstractDao<Cliente, Long> implements ClienteDao {

	@Override
	public List<Cliente> findByEmail(String email) {
		return createQuery("select c from Cliente where c.email = ?1", email);
	}

	@Override
	public List<Cliente> findByCpf(String cpf) {
		return createQuery("select c from Cliente where c.cpf = ?1", cpf);
	}

	@Override
	public List<Cliente> findByEmailAndSenhaCliente(String email, String password) {
		return createQuery("select c from Cliente where c.email = ?1 and c.senhaCliente = ?2", email, password);
	}

	@Override
	public List<Cliente> findByDataNascimento(LocalDate dataNasc) {
		return createQuery("select c from Cliente where c.dataNascimento = ?1", dataNasc);
	}

}
