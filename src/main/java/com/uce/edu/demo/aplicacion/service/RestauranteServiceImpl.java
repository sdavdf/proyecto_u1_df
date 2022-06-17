package com.uce.edu.demo.aplicacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.aplicacion.modelo.Restaurante;
import com.uce.edu.demo.aplicacion.repository.IRestauranteRepository;

@Service
public class RestauranteServiceImpl implements IRestauranteService{

	@Autowired
	private IRestauranteRepository iRestauranteRepository;
	
	@Override
	public void insertarRestaurante(Restaurante r) {
		// TODO Auto-generated method stub
		this.iRestauranteRepository.insertarRestaurante(r);
	}

	@Override
	public Restaurante buscarRestaurante(String nombre) {
		// TODO Auto-generated method stub
		return this.iRestauranteRepository.buscarRestaurante(nombre);
	}

	@Override
	public void actualizarRestaurante(Restaurante r) {
		// TODO Auto-generated method stub
		this.iRestauranteRepository.actualizarRestaurante(r);
	}

	@Override
	public void eliminarRestaurante(String nombre) {
		// TODO Auto-generated method stub
		this.iRestauranteRepository.eliminarRestaurante(nombre);
	}

}
