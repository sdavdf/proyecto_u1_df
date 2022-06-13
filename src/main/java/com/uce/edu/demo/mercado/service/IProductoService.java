package com.uce.edu.demo.mercado.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.edu.demo.mercado.modelo.Producto;

public interface IProductoService {

	public void ingresar(String nombre, int cantidad, BigDecimal precioDist, LocalDateTime fechaIngreso);
	
	public Producto consultar(String nombre);
	
	public void actualizar(Producto p);
	
	public void borrar(String nombre);

}
