package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.mercado.service.IGestorInventarioService;

@SpringBootApplication
public class ProyectoU1DfApplication implements CommandLineRunner{

//	@Autowired
//	private ITransferenciaService iTransferenciaService;
//	
//	@Autowired
//	private IDepositoService depositoService;
//	
//	@Autowired
//	private IRetiroService iRetiroService; 
//	
//	@Autowired
//	private ICuentaBancariaService icuentabancariaService;
//	

	@Autowired
	private IGestorInventarioService igestorInventarioService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		//iTransferenciaService.realizarTransferencia("12", "13", new BigDecimal(20));
		
		//this.depositoService.realizarDesposito("14", new BigDecimal(50));
//		CuentaBancaria cuentaBancaria = new CuentaBancaria();
//		cuentaBancaria.setNumero("10");
//		cuentaBancaria.setSaldo(new BigDecimal(500));
//		
//		System.out.println("Cuenta Bancaria");
//		this.icuentabancariaService.insertarCuenta(cuentaBancaria);
//		cuentaBancaria.setNumero("20");
//		this.icuentabancariaService.actualizar(cuentaBancaria);
//		this.icuentabancariaService.buscar("20");
//		this.icuentabancariaService.borrar("10");
//		
//		System.out.println("\nSe realiza la Transferencia");
//		this.iTransferenciaService.realizarTransferencia("11", "21", new BigDecimal(50));
//		this.iTransferenciaService.buscarTransferencia("11");
//		this.iTransferenciaService.actualizarTransferencia("11", "21", new BigDecimal(10));
//		this.iTransferenciaService.borrarTransferencia("11");
//		
//		System.out.println("\nSe realiza el Deposito");
//		this.depositoService.realizarDesposito("13", new BigDecimal(15));
//		this.depositoService.buscarDeposito("13");
//		this.depositoService.actualizarDeposito("13",  new BigDecimal(20));
//		this.depositoService.borrarDeposito("13");
		
		//Parte del deber-Realizar un retiro
		//this.iRetiroService.realizarRetiro("15", new BigDecimal(30));
		
		this.igestorInventarioService.agregarProducto("Carne", 350, new BigDecimal(4.50),LocalDateTime.of(2022,3,14,1,3));
		this.igestorInventarioService.agregarProducto("Salchicha", 200, new BigDecimal(2.30),LocalDateTime.of(2022,3,11,9,8));
		this.igestorInventarioService.agregarProducto("Huevos", 500, new BigDecimal(2.40), LocalDateTime.of(2022,12,4,12,4));
		this.igestorInventarioService.agregarProducto("Cereal", 440, new BigDecimal(1.50),LocalDateTime.of(2022,10,1,3,0));
		this.igestorInventarioService.agregarProducto("Bebidas", 100, new BigDecimal(5.60), LocalDateTime.of(2022,9,3,4,44));
		
		//Realizamos la consulta a traves de la fecha y esto nos dará un reporte
		this.igestorInventarioService.consultar(LocalDateTime.of(2022, 5, 1, 1, 3));
		
	}
}
