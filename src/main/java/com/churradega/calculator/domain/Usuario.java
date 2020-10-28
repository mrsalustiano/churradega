package com.churradega.calculator.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@SuppressWarnings("serial")
@Entity
@Table(name = "usuario")
public class Usuario extends AbstractEntity<Long>{

	
	
	@Column(nullable = false, length = 100)
	private String nome;
	
	@Column(nullable = false, length = 100)
	private String login;
	
	@Column(nullable = false, length = 100)
	private String senha;

	@Transient
	@Column(nullable = false, length = 100)
	private String senhaValidacao;
	
	@Column(nullable = false, length = 100)
	private Boolean ativo;
	
	@Column(nullable = false, columnDefinition = "DATE")
	@DateTimeFormat(iso = ISO.DATE, pattern = "")
	private LocalDate dataCadastro;
	
	@Column(nullable = false, length = 20)
	private String perfil;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	
	

	public String getSenhaValidacao() {
		return senhaValidacao;
	}

	public void setSenhaValidacao(String senhaValidacao) {
		this.senhaValidacao = senhaValidacao;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", login=" + login + ", senha=" + senha + ", senhaValidacao=" + senhaValidacao
				+ ", ativo=" + ativo + ", dataCadastro=" + dataCadastro + ", perfil=" + perfil + "]";
	}	
	
	
}
