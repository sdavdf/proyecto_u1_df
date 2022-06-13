package com.uce.edu.demo.mercado.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.mercado.modelo.Inventario;
import com.uce.edu.demo.mercado.modelo.Producto;

@Repository
public class InventarioRepositoryImpl implements IInventarioRepository{

	@Override
	public void insertar(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Se ha creado el inventario en la base de datos: " + i);
	}

	@Override
	public Inventario consultar() {
		// TODO Auto-generated method stub
		System.out.println("Consultando en la base de datos el inventario...");
		
		Inventario inventario = new Inventario();
		List<Producto> listaConsultada = new ArrayList<>();
		Producto p1 = new Producto();
		p1.setNombre("Carne");
		p1.setCantidad(350);
		p1.setFechaIngresoBodega(LocalDateTime.of(2022,3,14,1,3));
		p1.setPrecioDistribuidor(new BigDecimal(4.50));
		
		Producto p2 = new Producto();
		p2.setNombre("Salchicha");
		p2.setCantidad(200);
		p2.setFechaIngresoBodega(LocalDateTime.of(2022,3,11,9,8));
		p2.setPrecioDistribuidor(new BigDecimal(2.30));
		
		Producto p3 = new Producto();
		p3.setNombre("Huevos");
		p3.setCantidad(500);
		p3.setFechaIngresoBodega(LocalDateTime.of(2022,12,4,12,4));
		p3.setPrecioDistribuidor(new BigDecimal(2.40));
		
		Producto p4 = new Producto();
		p4.setNombre("Cereal");
		p4.setCantidad(440);
		p4.setFechaIngresoBodega(LocalDateTime.of(2022,10,1,3,0));
		p4.setPrecioDistribuidor(new BigDecimal(1.50));
		
		Producto p5 = new Producto();
		p5.setNombre("Bebidas");
		p5.setCantidad(100);
		p5.setFechaIngresoBodega(LocalDateTime.of(2022,9,3,4,44));
		p5.setPrecioDistribuidor(new BigDecimal(5.60));
		
		listaConsultada.add(p1);
		listaConsultada.add(p2);
		listaConsultada.add(p3);
		listaConsultada.add(p4);
		listaConsultada.add(p5);
		inventario.setListaProductos(listaConsultada);
		
		return inventario;
	}

	@Override
	public void actualizar(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el inventario en la base de datos: " + i);
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el inventario de la base de datos");
	}

}
