package com.uce.edu.demo.mercado.repository;

import com.uce.edu.demo.mercado.modelo.Inventario;

public interface IInventarioRepository {
	
	public void insertar(Inventario i);
	
	public Inventario consultar();
	
	public void actualizar(Inventario i);
		
	public void eliminar();
}
