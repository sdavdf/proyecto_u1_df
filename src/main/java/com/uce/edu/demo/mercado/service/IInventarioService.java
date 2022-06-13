package com.uce.edu.demo.mercado.service;

import com.uce.edu.demo.mercado.modelo.Inventario;
import com.uce.edu.demo.mercado.modelo.Producto;

public interface IInventarioService {
	
	public void ingresar(Inventario i);
	
	public Inventario consultar();
	
	public void actualizar(Inventario i);
	
	public void eliminar();
	
	public void agregarProducto(Producto p);

}
