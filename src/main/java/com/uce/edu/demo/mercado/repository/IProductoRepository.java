package com.uce.edu.demo.mercado.repository;

import com.uce.edu.demo.mercado.modelo.Producto;

public interface IProductoRepository {
	
	public void insertar(Producto p);
	
	public Producto buscar(String nombre);
	
	public void actualizar(Producto p);
	
	public void eliminar(String nombre);

}
