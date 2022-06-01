package com.uce.edu.demo.aplicacion;

import org.springframework.stereotype.Component;

@Component
public class Usuario {
	
	private String nombre;
	private String apellido;
	private String ubicacion;
	private int numeroTarjetaCredito;
	
	//SET y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public int getNumeroTarjetaCredito() {
		return numeroTarjetaCredito;
	}
	public void setNumeroTarjetaCredito(int numeroTarjetaCredito) {
		this.numeroTarjetaCredito = numeroTarjetaCredito;
	}

	
	

}
