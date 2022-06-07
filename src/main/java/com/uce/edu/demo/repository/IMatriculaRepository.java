package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaRepository {
	
			//C: crear/insertar
			public void insertarMatricula(Matricula ma);
			
			//R: leer/buscar
			public Matricula buscarMatricula(String numero);
			
			//U: actualizar
			public void actualizarMatricula(Matricula ma);
				
			//D: eliminar
			public void eliminarMatricula(String numero);

}
