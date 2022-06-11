package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository{

	@Override
	public void insertar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se inserta la transferencia en la baese de datos"+t);
		
	}
	
	@Override
	public void actualizar(Transferencia t) {
		System.out.println("Se ha actualizado en la base la transferencia: " + t);
	}

	@Override
	public Transferencia buscar(String numeroCtaDestino) {
		System.out.println("Se busca la transferencia en la cuenta: " + numeroCtaDestino);
		Transferencia transferencia = new Transferencia();
		transferencia.setNumeroCuentaDestino(numeroCtaDestino);
		return transferencia;
	}

	@Override
	public void eliminar(String numeroCtaDestino) {
		System.out.println("Transferencia eliminada en la cuenta: " + numeroCtaDestino);

	}

	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaRetiro) {
		// TODO Auto-generated method stub
		//Aqui debereia estar el SQL a la base
		List<Transferencia> listaConsulta = new ArrayList<>();
		Transferencia trans1 = new Transferencia();
		trans1.setFechaTransferencia(LocalDateTime.now());
		trans1.setMontoTransferir(new BigDecimal(100));
		trans1.setNumeroCuentaDestino("1234");
		trans1.setNumeroCuentaOrigen("12567");
		listaConsulta.add(trans1);
		
		return listaConsulta;
	}

}
