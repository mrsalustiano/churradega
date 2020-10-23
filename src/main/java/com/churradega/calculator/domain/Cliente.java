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
@Table(name = "cliente")
public class Cliente extends AbstractEntity<Long> {

	@Column(nullable = false, columnDefinition = "DATE")
	@DateTimeFormat(iso = ISO.DATE, pattern = "")
	private LocalDate dataNascimento;

	
	@Column(name = "cpf", nullable = false, length = 20, unique = true)
	private String cpf;

	@Column(name = "email", nullable = false, length = 80)
	private String email;

	@Column(name = "nome", nullable = false, length = 80)
	private String nome;

	@Column(name = "senhaCliente", nullable = false, length = 200)
	private String senhaCliente;

	
	@Transient
	@Column(name = "senhaCliente2", nullable = false, length = 200)
	private String senhaCliente2;
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenhaCliente() {
		return senhaCliente;
	}

	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}
	
	

	public String getSenhaCliente2() {
		return senhaCliente2;
	}

	public void setSenhaCliente2(String senhaCliente2) {
		this.senhaCliente2 = senhaCliente2;
	}

	@Override
	public String toString() {
		return "Cliente [dataNascimento=" + dataNascimento + ", cpf=" + cpf + ", email=" + email + ", nome=" + nome
				+ ", senhaCliente=" + senhaCliente + ", senhaCliente2=" + senhaCliente2 + "]";
	}
	
	
	
}
