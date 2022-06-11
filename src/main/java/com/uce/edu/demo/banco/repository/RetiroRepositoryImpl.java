package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepositoryImpl implements IRetiroRepository{

	@Override
	public void retirar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se realizó el retiro: " + r);
	}

	@Override
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Retiro> listaRetiros = new ArrayList<>();
		Retiro reti1 = new Retiro();
		reti1.setFecha(LocalDateTime.of(2022, 12, 20, 12, 34, 10));
		reti1.setMonto(new BigDecimal(25));
		reti1.setNumeroCuenta("1538");
		
		listaRetiros.add(reti1);
		
		return listaRetiros;
	}

}
