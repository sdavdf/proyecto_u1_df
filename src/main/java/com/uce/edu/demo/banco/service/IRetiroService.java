package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

public interface IRetiroService {
	
	public void realizarRetiro(String numeroCuenta, BigDecimal monto);

}
