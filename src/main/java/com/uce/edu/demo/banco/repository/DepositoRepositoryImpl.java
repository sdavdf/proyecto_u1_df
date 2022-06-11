package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository{
	

	@Override
	public void insertarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se creó el deposito: " + d);
	}

	@Override
	public void actualizar(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Deposito insertado: " + d);
	}

	@Override
	public Deposito buscar(String numeroCtaDestino) {
		System.out.println("Se busca el deposito en la cuenta: " + numeroCtaDestino);
		Deposito deposito = new Deposito();
		deposito.setNumeroCuentaDestino(numeroCtaDestino);
		deposito.setMonto(new BigDecimal(200));
		return deposito;
	}

	@Override
	public void eliminar(String numeroCtaDestino) {
		System.out.println("Deposito eliminado en la cuenta: " + numeroCtaDestino);

	}

	@Override
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Deposito> listaDepositos = new ArrayList<>();
		Deposito depo1 = new Deposito();
		depo1.setFecha(LocalDateTime.of(2021, 2, 10, 8, 50, 2));
		depo1.setMonto(new BigDecimal(20));
		depo1.setNumeroCuentaDestino("1237");
		
		listaDepositos.add(depo1);
		
		Deposito depo2 = new Deposito();
		depo2.setFecha(LocalDateTime.of(2021, 1, 15, 8, 60, 1));
		depo2.setMonto(new BigDecimal(50));
		depo2.setNumeroCuentaDestino("33237");
		
		listaDepositos.add(depo2);
		
		return listaDepositos;
	}
}
