package com.uce.edu.demo.mercado.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.mercado.modelo.Inventario;
import com.uce.edu.demo.mercado.modelo.Producto;
import com.uce.edu.demo.mercado.repository.IInventarioRepository;

@Service
public class InventarioServiceImpl implements IInventarioService{

	@Autowired
	private IInventarioRepository iInventarioRepository;
	
	@Override
	public void ingresar(Inventario i) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.insertar(i);
	}

	@Override
	public Inventario consultar() {
		// TODO Auto-generated method stub
		return this.iInventarioRepository.consultar();
	}

	@Override
	public void actualizar(Inventario i) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.actualizar(i);
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		this.iInventarioRepository.eliminar();
	}

	@Override
	public void agregarProducto(Producto p) {
		// TODO Auto-generated method stub
		Inventario inventario = this.iInventarioRepository.consultar();
		inventario.getListaProductos().add(p);
		this.iInventarioRepository.actualizar(inventario);

		System.out.println("Se ha añadido un producto: " + p.getNombre());
	}

}
