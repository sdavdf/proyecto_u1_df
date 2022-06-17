package com.uce.edu.demo.aplicacion.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.aplicacion.modelo.Restaurante;

@Repository
public class RestauranteRepositoryImpl implements IRestauranteRepository{

	@Override
	public void insertarRestaurante(Restaurante r) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base el restaurante: " + r);
	}

	@Override
	public Restaurante buscarRestaurante(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base el restaurante: " + nombre);
		Restaurante r = new Restaurante();
		r.setNombre(nombre);
		return r;
	}

	@Override
	public void actualizarRestaurante(Restaurante r) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base el restaurante: " + r);
	}

	@Override
	public void eliminarRestaurante(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base restaurante: " + nombre);
	}

}
