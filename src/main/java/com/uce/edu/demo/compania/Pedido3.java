package com.uce.edu.demo.compania;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Pedido3 {
	
	private double totalFactura;
	
	private Usuario usuario;// 3) a su metodo Set le pongo @Autowired
	private Restaurante restaurante;// 3) a su metodo Set le pongo @Autowired
	
	
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
		
		return "Pedido realizado con exito (DI por métodos SET)";
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

	@Autowired
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public Restaurante getRestaurante() {
		return restaurante;
	}

	@Autowired
	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}
	
	

}
