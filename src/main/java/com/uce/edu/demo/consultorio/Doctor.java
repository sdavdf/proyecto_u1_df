package com.uce.edu.demo.consultorio;

import org.springframework.stereotype.Component;

//Les voy a poner una metadata
@Component
public class Doctor {
	
	private String nombre;
	private String apellido;
	private int edad;
	private String Ciudad;
	
	
	
	//SET y GET
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCiudad() {
		return Ciudad;
	}
	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
	
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
	
	

}
