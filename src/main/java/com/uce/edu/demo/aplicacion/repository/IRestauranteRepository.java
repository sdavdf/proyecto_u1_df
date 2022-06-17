package com.uce.edu.demo.aplicacion.repository;

import com.uce.edu.demo.aplicacion.modelo.Restaurante;

public interface IRestauranteRepository {
	
	public void insertarRestaurante(Restaurante r);
	
	public Restaurante buscarRestaurante(String nombre);
	
	public void actualizarRestaurante(Restaurante r);
		
	public void eliminarRestaurante(String nombre);

}
