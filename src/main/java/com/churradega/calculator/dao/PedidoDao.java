package com.churradega.calculator.dao;

import java.time.LocalDate;
import java.util.List;

import com.churradega.calculator.domain.Cliente;
import com.churradega.calculator.domain.Pedido;
import com.churradega.calculator.domain.Produto;


public interface PedidoDao {
	
	void save(Pedido pedido);

    void update(Pedido pedido);
    
    Pedido findById(Long id); 

    void delete(Long id);

    List<Pedido> findAll();
    
    Pedido findByProduto(Produto produto);
    
    Pedido findByCliente(Cliente cliente);
    
    List<Pedido> findByDataPedido(LocalDate data);

}
