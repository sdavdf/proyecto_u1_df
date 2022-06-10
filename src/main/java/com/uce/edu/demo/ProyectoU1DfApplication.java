package com.uce.edu.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.service.ICuentaBancariaService;
import com.uce.edu.demo.banco.service.IDepositoService;
import com.uce.edu.demo.banco.service.IRetiroService;
import com.uce.edu.demo.banco.service.ITransferenciaService;

@SpringBootApplication
public class ProyectoU1DfApplication implements CommandLineRunner{

	@Autowired
	private ITransferenciaService iTransferenciaService;
	
	@Autowired
	private IDepositoService depositoService;
	
	@Autowired
	private IRetiroService iRetiroService; 
	
	@Autowired
	private ICuentaBancariaService icuentabancariaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		//iTransferenciaService.realizarTransferencia("12", "13", new BigDecimal(20));
		
		//this.depositoService.realizarDesposito("14", new BigDecimal(50));
		CuentaBancaria cuentaBancaria = new CuentaBancaria();
		cuentaBancaria.setNumero("10");
		cuentaBancaria.setSaldo(new BigDecimal(500));
		
		System.out.println("Cuenta Bancaria");
		this.icuentabancariaService.insertarCuenta(cuentaBancaria);
		cuentaBancaria.setNumero("20");
		this.icuentabancariaService.actualizar(cuentaBancaria);
		this.icuentabancariaService.buscar("20");
		this.icuentabancariaService.borrar("10");
		
		System.out.println("\nSe realiza la Transferencia");
		this.iTransferenciaService.realizarTransferencia("11", "21", new BigDecimal(50));
		this.iTransferenciaService.buscarTransferencia("11");
		this.iTransferenciaService.actualizarTransferencia("11", "21", new BigDecimal(10));
		this.iTransferenciaService.borrarTransferencia("11");
		
		System.out.println("\nSe realiza el Deposito");
		this.depositoService.realizarDesposito("13", new BigDecimal(15));
		this.depositoService.buscarDeposito("13");
		this.depositoService.actualizarDeposito("13",  new BigDecimal(20));
		this.depositoService.borrarDeposito("13");
		
		//Parte del deber-Realizar un retiro
		//this.iRetiroService.realizarRetiro("15", new BigDecimal(30));
		
	}
}
