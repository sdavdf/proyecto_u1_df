package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoRepository {

	public void insertarDeposito(Deposito d);

	public Deposito buscar(String numeroCtaDestino);
		
	public void actualizar(Deposito d);
			
	public void eliminar(String numeroCtaDestino);	
	
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);
}
