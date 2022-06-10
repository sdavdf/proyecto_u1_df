package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.repository.IDepositoRepository;

@Service
public class DepositoServiceImpl implements IDepositoService{

	@Autowired
	private ICuentaBancariaService bancariaService;
	
	@Autowired
	private IDepositoRepository depositoRepository;
	
	@Override
	public void realizarDesposito(String numeroCtaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaDestino = this.bancariaService.buscar(numeroCtaDestino);
		BigDecimal saldoCtaDestino = ctaDestino.getSaldo();
		BigDecimal saldoFinal = saldoCtaDestino.add(monto);
		ctaDestino.setSaldo(saldoFinal);
		this.bancariaService.actualizar(ctaDestino);
		
		Deposito deposito = new Deposito();
		deposito.setFecha(LocalDateTime.now());
		deposito.setNumeroCuentaDestino(numeroCtaDestino);
		deposito.setMonto(monto);
		this.depositoRepository.insertarDeposito(deposito);
	}
	
	@Override
	public Deposito buscarDeposito(String numeroCtaDestino) {
		// TODO Auto-generated method stub
		return this.depositoRepository.buscar(numeroCtaDestino);
	}

	@Override
	public void borrarDeposito(String numeroCtaDestino) {
		// TODO Auto-generated method stub
		this.depositoRepository.eliminar(numeroCtaDestino);
	}

	@Override
	public void actualizarDeposito(String numeroCtaDestino, BigDecimal monto) {
		
		Deposito deposito1 = new Deposito();
		deposito1.setFecha(LocalDateTime.now());
		deposito1.setNumeroCuentaDestino(numeroCtaDestino);
		deposito1.setMonto(monto);
		this.depositoRepository.actualizar(deposito1);

	}

}
