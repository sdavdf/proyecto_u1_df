package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.compania.Pedido;
import com.uce.edu.demo.compania.Pedido2;
import com.uce.edu.demo.compania.Pedido3;

@SpringBootApplication
public class ProyectoU1DfApplication implements CommandLineRunner{

	
//	// 1) DI por atributos
//	@Autowired
//	private Pedido pedido;
	
//	// 2) Para el DI por constructor
//	@Autowired
//	private Pedido2 pedido;
	
	// 3) Para el DI por métodos SET
	@Autowired
	private Pedido3 pedido;
	

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mi primer proyecto con Spring Framework");
		
		
		String respuesta = pedido.ordenar(12.75, "Stalyn", "Fueltala", "N.P Llona", 34876653, "Burger King", "Av. Amazonas", "Comida Rápida");
		System.out.println(respuesta);
	}

}
