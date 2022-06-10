package com.uce.edu.demo.banco.repository;

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

}
