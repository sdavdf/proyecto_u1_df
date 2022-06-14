package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.repository.IRetiroRepository;

@Service
public class RetiroServiceImpl implements IRetiroService{

	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService bancariaService;
	
	@Autowired
	private IRetiroRepository retiroRepository;
	
	@Override
	public void realizarRetiro(String numeroCuenta, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaOrigen = this.bancariaService.buscar(numeroCuenta);
		BigDecimal saldoCtaOrigen = ctaOrigen.getSaldo();
		BigDecimal saldoFinal = saldoCtaOrigen.subtract(monto);
		ctaOrigen.setSaldo(saldoFinal);
		this.bancariaService.actualizar(ctaOrigen);
		
		Retiro retiro = new Retiro();
		retiro.setFecha(LocalDateTime.now());
		retiro.setNumeroCuenta(numeroCuenta);
		retiro.setMonto(monto);
		this.retiroRepository.retirar(retiro);
	}

}
