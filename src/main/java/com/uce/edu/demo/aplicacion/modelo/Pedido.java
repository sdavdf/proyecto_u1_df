package com.uce.edu.demo.aplicacion.modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class Pedido {
	
	private String NumFactura;
	private Usuario usuario;
	private Restaurante restaurante;
	
	
	@Override
	public String toString() {
		return "Pedido [NumFactura=" + NumFactura + ", usuario=" + usuario + ", restaurante=" + restaurante + "]";
	}
	// SET y GET
	public String getNumFactura() {
		return NumFactura;
	}
	public void setNumFactura(String numFactura) {
		NumFactura = numFactura;
	}
	public Usuario getUsuario() {
		return usuario;
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
