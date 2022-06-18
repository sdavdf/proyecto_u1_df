package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.ProfesorGeneral;
import com.uce.edu.demo.banco.modelo.ProfesorMateria;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService{

	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	
	@Autowired
	private ProfesorGeneral profesorGeneral;
	
	@Autowired
	private ProfesorMateria profesorMateria;
	
	@Lookup
	public ProfesorGeneral obtenerProfesorG() {
		return null;
	}
	
	@Lookup
	public ProfesorMateria obtenerProfesorM() {
		ProfesorMateria profeM = new ProfesorMateria();
		profeM.setNombre("Tapia");
		profeM.setApellido("Jose");
		return profeM;
	}
	
	@Override
	public void ingresarMatricula(Matricula ma) {
		// TODO Auto-generated method stub
		System.out.println("DI desde Service SINGLETON" + this.profesorGeneral);
		System.out.println("DI desde Service PROTOTYPE" + this.profesorMateria);
		
		System.out.println("DI un ejemplo General: " + this.obtenerProfesorG());
		System.out.println("DI un ejemplo Materia: " + this.obtenerProfesorM());
		this.iMatriculaRepository.insertarMatricula(ma);
		
	}

	@Override
	public Matricula buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.iMatriculaRepository.buscarMatricula(numero);
	}

	@Override
	public void actualizarMatricula(Matricula ma) {
		// TODO Auto-generated method stub
		this.iMatriculaRepository.actualizarMatricula(ma);
	}

	@Override
	public void borrarMatricula(String numero) {
		// TODO Auto-generated method stub
		this.iMatriculaRepository.eliminarMatricula(numero);
	}

}
