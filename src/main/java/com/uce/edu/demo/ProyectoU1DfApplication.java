package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.repository.IMateriaRepository;
import com.uce.edu.demo.repository.IMatriculaRepository;
import com.uce.edu.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoU1DfApplication implements CommandLineRunner{
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IMateriaRepository iMateriaRepository;
	
	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		System.out.println("\nCRUD para Estudiante:\n");
		// Metodos CRUD de Estudiante
		Estudiante e = new Estudiante();
		e.setNombre("Stalyn");
		e.setApellido("Fueltala");		
		e.setCedula("0401754601");
		
		this.estudianteService.ingresarEstudiante(e);
		
		e.setCedula("0401754602");
		this.estudianteService.actualizarEstudiante(e);
		
		this.estudianteService.buscarPorApellido("Fueltala");
		
		this.estudianteService.borrarEstudiante("0401754601");
		
		System.out.println("\nCRUD para Materia:\n");
		
		// Metodos CRUD de Materia
		Materia m1 = new Materia();
		m1.setNombre("IA");
		m1.setSemestre("Cuarto");
		
		this.iMateriaRepository.insertarMateria(m1);
		
		Materia m2 = new Materia();
		m2.setNombre("Algebra lineal");
		m2.setSemestre("Cuarto");
		
		m1.setNombre("Programación");
		this.iMateriaRepository.actualizarMateria(m1);
		
		this.iMateriaRepository.buscarMateria("Programación");
		
		this.iMateriaRepository.eliminarMateria("IA");
		
		
		System.out.println("\nCRUD para Matricula:\n");
		
		
		// Metodos CRUD de Matricula
		
		List<Materia> materias = new ArrayList<Materia>();
		materias.add(m1);
		materias.add(m2);
		
		Matricula ma = new Matricula();
		ma.setEstudiante(e);
		ma.setMateria(materias);
		ma.setNumero("01");
		
		this.iMatriculaRepository.insertarMatricula(ma);
		
		ma.setNumero("02");
		this.iMatriculaRepository.actualizarMatricula(ma);
		
		this.iMatriculaRepository.buscarMatricula("02");
		
		this.iMatriculaRepository.eliminarMatricula("01");
	}
}
