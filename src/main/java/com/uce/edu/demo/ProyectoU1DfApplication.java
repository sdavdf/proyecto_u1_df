package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.modelo.ProfesorGeneral;
import com.uce.edu.demo.banco.modelo.ProfesorMateria;
import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1DfApplication implements CommandLineRunner{

	@Autowired
	private ProfesorGeneral general;
	
	@Autowired
	private ProfesorGeneral general1;
	
	@Autowired
	private ProfesorMateria materia;
	
	@Autowired
	private ProfesorMateria materia1;
	
	@Autowired
	private IMatriculaService iMatriculaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		System.out.println("EJEMPLO SINGLETON");
		this.general.setNombre("Edison");
		this.general.setApellido("Cayambe");
		
		System.out.println(this.general);
		System.out.println("---");
		System.out.println(this.general1);
		this.general1.setNombre("Pepito");
		System.out.println("---");
		System.out.println(this.general);
		
		System.out.println("---");
		System.out.println(this.general1);
		
		
		System.out.println("EJEMPLO PROTOTYPE");
		this.materia.setNombre("Daniel");
		this.materia.setApellido("Teran");	
		System.out.println(this.materia);
		System.out.println("---");
		System.out.println(this.materia1);
		
		Matricula matricula1 = new Matricula();
		matricula1.setEstudiante(new Estudiante());
		List<Materia> materia = new ArrayList<>();
		matricula1.setMateria(materia);
		matricula1.setNumero("14");


		this.iMatriculaService.ingresarMatricula(matricula1);
	
	
	}
	
	
}
