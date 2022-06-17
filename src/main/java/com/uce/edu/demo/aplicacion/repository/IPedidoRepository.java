package com.uce.edu.demo.aplicacion.repository;

import com.uce.edu.demo.aplicacion.modelo.Pedido;

public interface IPedidoRepository {

	public void insertarPedido(Pedido p);
	
	public Pedido buscarPedido(String NumFactura);
	
	public void actualizarPedido(Pedido p);
		
	public void eliminarPedido(String NumFactura);

}
