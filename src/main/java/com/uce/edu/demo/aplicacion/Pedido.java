package com.uce.edu.demo.aplicacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Pedido {
	
	private double totalFactura;
	
	@Autowired// 1) para atributos
	private Usuario usuario;
	
	@Autowired// 1) para atributos
	private Restaurante restaurante;
	
	
	public String ordenar(double totalFactura, String nombreUsuario, String apellidoUsuario, String ubicacionUsuario, int numeroTarjetaCredito,
			String nombreRestaurant, String direccionRestaurante, String categoriaComida) {
		
		this.usuario.setNombre(nombreUsuario);
		this.usuario.setApellido(apellidoUsuario);
		this.usuario.setUbicacion(ubicacionUsuario);
		this.usuario.setNumeroTarjetaCredito(numeroTarjetaCredito);
		
		
		this.restaurante.setNombre(nombreRestaurant);
		this.restaurante.setDireccion(direccionRestaurante);
		this.restaurante.setCategoriaComida(categoriaComida);
		
		// Seteamos los atributos del pedido
		this.totalFactura = totalFactura;
		
		//Se inserta en la base de datos
		
		return "Pedido realizado con exito (DI por atributos)";
	}


	//SET y GET
	public Usuario getUsuario() {
		return usuario;
	}


	public double getTotalFactura() {
		return totalFactura;
	}


	public void setTotalFactura(double totalFactura) {
		this.totalFactura = totalFactura;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public Restaurante getRestaurante() {
		return restaurante;
	}


	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}
	
	

}
