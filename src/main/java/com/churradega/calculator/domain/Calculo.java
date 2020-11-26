package com.churradega.calculator.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


@SuppressWarnings("serial")
@Entity
public class Calculo extends AbstractEntity<Long>  {
	
	@Column(nullable = false, columnDefinition = "DATE")
	@DateTimeFormat(iso = ISO.DATE, pattern = "")
	private LocalDate data;
	
	
	private Integer qtdHomem;
	
	private Boolean homemGlutao;
	
	private Integer qtdMulheres;
	
	private Boolean mulherGlutao;
	
	private Integer qtdCrianca;
	
	private Double qtdCarnes;
	
	private Double qtdCerveja;
	
	private Double qtdRefrigerantes;

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Integer getQtdHomem() {
		return qtdHomem;
	}

	public void setQtdHomem(Integer qtdHomem) {
		this.qtdHomem = qtdHomem;
	}

	public Boolean getHomemGlutao() {
		return homemGlutao;
	}

	public void setHomemGlutao(Boolean homemGlutao) {
		this.homemGlutao = homemGlutao;
	}

	public Integer getQtdMulheres() {
		return qtdMulheres;
	}

	public void setQtdMulheres(Integer qtdMulheres) {
		this.qtdMulheres = qtdMulheres;
	}

	public Boolean getMulherGlutao() {
		return mulherGlutao;
	}

	public void setMulherGlutao(Boolean mulherGlutao) {
		this.mulherGlutao = mulherGlutao;
	}

	public Integer getQtdCrianca() {
		return qtdCrianca;
	}

	public void setQtdCrianca(Integer qtdCrianca) {
		this.qtdCrianca = qtdCrianca;
	}

	public Double getQtdCarnes() {
		return qtdCarnes;
	}

	public void setQtdCarnes(Double qtdCarnes) {
		this.qtdCarnes = qtdCarnes;
	}

	public Double getQtdCerveja() {
		return qtdCerveja;
	}

	public void setQtdCerveja(Double qtdCerveja) {
		this.qtdCerveja = qtdCerveja;
	}

	public Double getQtdRefrigerantes() {
		return qtdRefrigerantes;
	}

	public void setQtdRefrigerantes(Double qtdRefrigerantes) {
		this.qtdRefrigerantes = qtdRefrigerantes;
	}

	@Override
	public String toString() {
		return "Calculo [data=" + data + ", qtdHomem=" + qtdHomem + ", homemGlutao=" + homemGlutao + ", qtdMulheres="
				+ qtdMulheres + ", mulherGlutao=" + mulherGlutao + ", qtdCrianca=" + qtdCrianca + ", qtdCarnes="
				+ qtdCarnes + ", qtdCerveja=" + qtdCerveja + ", qtdRefrigerantes=" + qtdRefrigerantes + "]";
	}
	
	
	
}
