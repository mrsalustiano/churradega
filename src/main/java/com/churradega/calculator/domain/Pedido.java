package com.churradega.calculator.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


@SuppressWarnings("serial")
@Entity
public class Pedido extends AbstractEntity<Long>{
	
	@Column(nullable = false, columnDefinition = "DATE")
	@DateTimeFormat(iso = ISO.DATE, pattern = "")
	private LocalDate dataPedido;
	
	
	private int quantidade;
	
	@Column(nullable = false, scale = 2)
	private BigDecimal valor = new BigDecimal(0);
	

	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "produto_id")
	Produto produto;

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}



	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "Pedido [dataPedido=" + dataPedido + ", quantidade=" + quantidade + ", valor=" + valor + ", produto=" + produto + "]";
	}
	
	
	

}
