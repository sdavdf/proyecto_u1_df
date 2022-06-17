package com.uce.edu.demo.aplicacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.aplicacion.modelo.Pedido;
import com.uce.edu.demo.aplicacion.modelo.RepartidorComun;
import com.uce.edu.demo.aplicacion.modelo.RepartidorExclusivo;
import com.uce.edu.demo.aplicacion.repository.IPedidoRepository;

@Service
public class PedidoServiceImpl implements IPedidoService{

	@Autowired
	private IPedidoRepository iPedidoRepository;
	
	@Autowired
	private RepartidorComun comun;
	
	@Autowired
	private RepartidorExclusivo exclusivo;
	
	@Override
	public void insertarPedido(Pedido p) {
		// TODO Auto-generated method stub
		System.out.println("DI desde Service SINGLETON "+ this.comun);
		System.out.println("DI desde Service PROTOTYPE "+ this.exclusivo);
		this.iPedidoRepository.insertarPedido(p);
	}

	@Override
	public Pedido buscarPedido(String NumFactura) {
		// TODO Auto-generated method stub
		return this.iPedidoRepository.buscarPedido(NumFactura);
	}

	@Override
	public void actualizarPedido(Pedido p) {
		// TODO Auto-generated method stub
		this.iPedidoRepository.actualizarPedido(p);
		
	}

	@Override
	public void eliminarPedido(String NumFactura) {
		// TODO Auto-generated method stub
		this.iPedidoRepository.eliminarPedido(NumFactura);
	}

}
