package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Materia;

public interface IMateriaRepository {
	
		//C: crear/insertar
		public void insertarMateria(Materia m);
		
		//R: leer/buscar
		public Materia buscarMateria(String nombre);
		
		//U: actualizar
		public void actualizarMateria(Materia m);
			
		//D: eliminar
		public void eliminarMateria(String nombre);

}
