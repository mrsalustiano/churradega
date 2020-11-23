package com.churradega.calculator.domain;

import java.math.BigDecimal;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;

@SuppressWarnings("serial")
@Entity
@Table(name = "produto")
public class Produto extends AbstractEntity<Long>{

	@Column(nullable = false, length = 50)
	private String nome;
	
	@Column(nullable = true, length = 10000)
	private String descricao;
	
	@Column(nullable = false, scale = 2)
	private BigDecimal valor = new BigDecimal(0);
	
	
	@Column(nullable = false, length = 100)
	private String categoria;
	
	

	@Column
	private byte[] imagemProduto;
	
	@Transient //esse campo não será persistido no hibernate
	private String imagemEncoded;

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public byte[] getImagemProduto() {
		return imagemProduto;
	}

	public void setImagemProduto(byte[] imagemProduto) {
		this.imagemProduto = imagemProduto;
	}

	public String getImagemEncoded() {
		return imagemEncoded;
	}

	public void setImagemEncoded(String imagemEncoded) {
		this.imagemEncoded = imagemEncoded;
	}

	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", descricao=" + descricao + ", valor=" + valor + ", categoria=" + categoria
				+ ", imagemProduto=" + Arrays.toString(imagemProduto) + ", imagemEncoded=" + imagemEncoded + "]";
	}
	
	
}
