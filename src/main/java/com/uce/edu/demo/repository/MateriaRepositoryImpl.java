package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Materia;

@Repository
public class MateriaRepositoryImpl implements IMateriaRepository{

	@Override
	public void insertarMateria(Materia m) {
		// TODO Auto-generated method stub
		System.out.println("Se ha creado la mateia:" + m);
	}

	@Override
	public Materia buscarMateria(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base la materia: " + nombre);
		Materia m = new Materia();
		m.setNombre(nombre);
		return m;
	}

	@Override
	public void actualizarMateria(Materia m) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la materia: " + m);
	}

	@Override
	public void eliminarMateria(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base la materia: " + nombre);
	}

}
