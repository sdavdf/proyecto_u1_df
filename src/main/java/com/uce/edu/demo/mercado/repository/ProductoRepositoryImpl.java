package com.uce.edu.demo.mercado.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.mercado.modelo.Producto;

@Repository
public class ProductoRepositoryImpl implements IProductoRepository{

	@Override
	public void insertar(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base un producto: " + p);
		
	}

	@Override
	public Producto buscar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base de datos el producto: " + nombre);
		Producto producto = new Producto();
		producto.setNombre(nombre);
		producto.setCantidad(12);
		producto.setFechaIngresoBodega(LocalDateTime.of(2022, 2, 2, 13, 6));
		producto.setPrecioDistribuidor(new BigDecimal(15.99));
		return producto;
	}

	@Override
	public void actualizar(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base de datos el producto: " + p);
		
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base de datos el producto: " + nombre);
	}

}
