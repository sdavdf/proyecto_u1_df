package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.repository.IMateriaRepository;

@Service
public class MateriaServiceImpl implements IMateriaService{

	@Autowired
	private IMateriaRepository iMateriaRepository;
	
	@Override
	public void ingresarMateria(Materia m) {
		// TODO Auto-generated method stub
		this.iMateriaRepository.insertarMateria(m);
	}

	@Override
	public Materia buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.iMateriaRepository.buscarMateria(nombre);
	}

	@Override
	public void actualizarMateria(Materia m) {
		// TODO Auto-generated method stub
		this.iMateriaRepository.actualizarMateria(m);
	}

	@Override
	public void borrarMateria(String nombre) {
		// TODO Auto-generated method stub
		this.iMateriaRepository.eliminarMateria(nombre);
	}

}
