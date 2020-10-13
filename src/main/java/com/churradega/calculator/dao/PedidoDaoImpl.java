package com.churradega.calculator.dao;

import java.time.LocalDate;
import java.util.List;

import com.churradega.calculator.domain.Cliente;
import com.churradega.calculator.domain.Pedido;
import com.churradega.calculator.domain.Produto;

public class PedidoDaoImpl extends AbstractDao<Pedido, Long> implements PedidoDao{

	@Override
	public Pedido findByProduto(Produto produto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedido findByCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pedido> findByDataPedido(LocalDate data) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
