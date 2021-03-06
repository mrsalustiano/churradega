package com.churradega.calculator.dao;

import java.util.List;

import com.churradega.calculator.domain.Usuario;

public interface UsuarioDao {

	void save(Usuario usuario);

	void update(Usuario usuario);

	Usuario findById(Long id);

	void delete(Long id);

	List<Usuario> findAll();

	List<Usuario> findByLogin(String login);

	List<Usuario> findByPerfil(String perfil);
	
	List<Usuario> findByLoginAndSenha(String login, String password);
}
