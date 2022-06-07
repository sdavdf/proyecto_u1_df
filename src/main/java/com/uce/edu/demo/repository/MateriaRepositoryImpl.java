package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Materia;

@Repository
public class MateriaRepositoryImpl implements IMateriaRepository{

	@Override
	public void insetar(Materia m) {
		// TODO Auto-generated method stub
		System.out.println("Se ha creado la mateia:...");
	}

	@Override
	public Materia buscar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base la materia: " + nombre);
		return null;
	}

	@Override
	public void actualizar(Materia m) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la materia: " + m);
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base la materia: " + nombre);
	}

}
