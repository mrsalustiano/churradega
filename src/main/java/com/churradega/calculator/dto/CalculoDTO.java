package com.churradega.calculator.dto;

import java.time.LocalDate;


public class CalculoDTO {
	
	private LocalDate data;
	private Double quantidadeBebidas;
	private Double quantidadeCarnes;
	private Integer quantidadeCrianca;
	private Integer quantidadeHomem;
	private Integer quantidadeMulheres;
	private Boolean glutaoHomem;
	private Boolean glutaoMulher;
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public Double getQuantidadeBebidas() {
		return quantidadeBebidas;
	}
	public void setQuantidadeBebidas(Double quantidadeBebidas) {
		this.quantidadeBebidas = quantidadeBebidas;
	}
	public Double getQuantidadeCarnes() {
		return quantidadeCarnes;
	}
	public void setQuantidadeCarnes(Double quantidadeCarnes) {
		this.quantidadeCarnes = quantidadeCarnes;
	}
	public Integer getQuantidadeCrianca() {
		return quantidadeCrianca;
	}
	public void setQuantidadeCrianca(Integer quantidadeCrianca) {
		this.quantidadeCrianca = quantidadeCrianca;
	}
	public Integer getQuantidadeHomem() {
		return quantidadeHomem;
	}
	public void setQuantidadeHomem(Integer quantidadeHomem) {
		this.quantidadeHomem = quantidadeHomem;
	}
	public Integer getQuantidadeMulheres() {
		return quantidadeMulheres;
	}
	public void setQuantidadeMulheres(Integer quantidadeMulheres) {
		this.quantidadeMulheres = quantidadeMulheres;
	}
	
	
	public Boolean getGlutaoHomem() {
		return glutaoHomem;
	}
	public void setGlutaoHomem(Boolean glutaoHomem) {
		this.glutaoHomem = glutaoHomem;
	}
	public Boolean getGlutaoMulher() {
		return glutaoMulher;
	}
	public void setGlutaoMulher(Boolean glutaoMulher) {
		this.glutaoMulher = glutaoMulher;
	}
	
	
	@Override
	public String toString() {
		return "CalculoDTO [data=" + data + ", quantidadeBebidas=" + quantidadeBebidas + ", quantidadeCarnes="
				+ quantidadeCarnes + ", quantidadeCrianca=" + quantidadeCrianca + ", quantidadeHomem=" + quantidadeHomem
				+ ", quantidadeMulheres=" + quantidadeMulheres + ", glutaoHomem=" + glutaoHomem + ", glutaoMulher="
				+ glutaoMulher + "]";
	}
	

	
}
