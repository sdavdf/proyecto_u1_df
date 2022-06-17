package com.uce.edu.demo.aplicacion.service;

import com.uce.edu.demo.aplicacion.modelo.Restaurante;

public interface IRestauranteService {
	
	public void insertarRestaurante(Restaurante r);
	
	public Restaurante buscarRestaurante(String nombre);
	
	public void actualizarRestaurante(Restaurante r);
		
	public void eliminarRestaurante(String nombre);

}
