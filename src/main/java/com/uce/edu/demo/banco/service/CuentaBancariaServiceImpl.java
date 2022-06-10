package com.uce.edu.demo.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;

@Repository
public class CuentaBancariaServiceImpl implements ICuentaBancariaService{

	@Autowired
	private ICuentaBancariaRepository bancariaRepository;
	
	@Override
	public void actualizar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		this.bancariaRepository.actualizar(c);
		
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return this.bancariaRepository.buscar(numero);
	}
	

	@Override
	public void borrar(String numero) {
		this.bancariaRepository.eliminar(numero);

	}

	@Override
	public void insertarCuenta(CuentaBancaria c) {
		this.bancariaRepository.insertar(c);

	}
	

}
