package com.uce.edu.demo.aplicacion.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.aplicacion.modelo.Pedido;

@Repository
public class PedidoRepositoryImpl implements IPedidoRepository{

	@Override
	public void insertarPedido(Pedido p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base el pedido: " + p);
	}

	@Override
	public Pedido buscarPedido(String NumFactura) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base el pedido: " + NumFactura);
		Pedido p = new Pedido();
		p.setNumFactura(NumFactura);
		return p;
	}

	@Override
	public void actualizarPedido(Pedido p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base el pedido: " + p);
	}

	@Override
	public void eliminarPedido(String NumFactura) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base el pedido: " + NumFactura);
	}

}
