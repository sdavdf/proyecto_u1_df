package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepositoryImpl implements IRetiroRepository{

	@Override
	public void retirar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se realizó el retiro: " + r);
	}

}
