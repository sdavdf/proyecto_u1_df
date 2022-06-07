package com.uce.edu.demo.repository;


import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository{

	@Override
	public void insetar(Matricula ma) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base la matricula: " + ma);
	}

	@Override
	public Matricula buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base la matricula: " + numero);
		return null;
	}

	@Override
	public void actualizar(Matricula ma) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la matricula: " + ma);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base la matricula: " + numero);
	}

}
