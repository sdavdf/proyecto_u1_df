package com.uce.edu.demo.aplicacion;

import org.springframework.stereotype.Component;

@Component
public class Restaurante {
	
	private String nombre;
	private String direccion;
	private String categoriaComida;
	
	//SET y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCategoriaComida() {
		return categoriaComida;
	}
	public void setCategoriaComida(String categoriaComida) {
		this.categoriaComida = categoriaComida;
	}
	
	
	

}
