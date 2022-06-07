package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService{

	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	
	@Override
	public void ingresarMatricula(Matricula ma) {
		// TODO Auto-generated method stub
		this.iMatriculaRepository.insetar(ma);
		
	}

	@Override
	public Matricula buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.iMatriculaRepository.buscar(numero);
	}

	@Override
	public void actualizarMatricula(Matricula ma) {
		// TODO Auto-generated method stub
		this.iMatriculaRepository.actualizar(ma);
	}

	@Override
	public void borrarMatricula(String numero) {
		// TODO Auto-generated method stub
		this.iMatriculaRepository.eliminar(numero);
	}

}
