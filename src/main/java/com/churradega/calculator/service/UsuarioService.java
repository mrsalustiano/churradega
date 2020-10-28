package com.churradega.calculator.service;

import java.util.List;

import com.churradega.calculator.domain.Usuario;

public interface UsuarioService {
	
	void save(Usuario usuario);

	void update(Usuario usuario);

	Usuario findById(Long id);

	void delete(Long id);

	List<Usuario> findAll();

	List<Usuario> findByLogin(String login);

	List<Usuario> findByPerfil(String perfil);
	
	List<Usuario> findByEmailAndSenha(String email, String password);
	


}
