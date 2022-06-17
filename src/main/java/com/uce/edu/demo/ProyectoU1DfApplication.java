package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.aplicacion.modelo.Pedido;
import com.uce.edu.demo.aplicacion.modelo.RepartidorComun;
import com.uce.edu.demo.aplicacion.modelo.RepartidorExclusivo;
import com.uce.edu.demo.aplicacion.modelo.Restaurante;
import com.uce.edu.demo.aplicacion.modelo.Usuario;
import com.uce.edu.demo.aplicacion.service.IPedidoService;
import com.uce.edu.demo.banco.modelo.ProfesorGeneral;
import com.uce.edu.demo.banco.modelo.ProfesorMateria;
import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1DfApplication implements CommandLineRunner{

	
	@Autowired
	private RepartidorComun comun;
	
	@Autowired
	private RepartidorComun comun1;
	
	@Autowired
	private RepartidorExclusivo exclusivo;
	
	@Autowired
	private RepartidorExclusivo exclusivo1;
	
	@Autowired
	private IPedidoService iPedidoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("EJEMPLO SINGLETON");
		this.comun.setNombre("Stalyn");
		this.comun.setApellido("Fueltala");
		
		System.out.println(this.comun);
		System.out.println("---");
		System.out.println(this.comun1);
		this.comun1.setNombre("David");
		System.out.println("---");
		System.out.println(this.comun);
		
		System.out.println("---");
		System.out.println(this.comun1);
		
		
		System.out.println("\nEJEMPLO PROTOTYPE");
		this.exclusivo.setNombre("Stiven");
		this.exclusivo.setApellido("Rosero");	
		System.out.println(this.exclusivo);
		System.out.println("---");
		System.out.println(this.exclusivo1);
		
		Pedido pedido1 = new Pedido();
		
		pedido1.setNumFactura("A01");
		pedido1.setRestaurante(new Restaurante());
		pedido1.setUsuario(new Usuario());
		
		this.iPedidoService.insertarPedido(pedido1);
		
	
	
	}
	
	
}
