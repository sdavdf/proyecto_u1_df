package com.uce.edu.demo.modelo;

public class Materia {

	private String nombre;
	private String semestre;
	
	
	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", semestre=" + semestre + "]";
	}
	// SET y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	} 
	
	
}
