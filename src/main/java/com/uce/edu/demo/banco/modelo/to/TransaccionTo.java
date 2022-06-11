package com.uce.edu.demo.banco.modelo.to;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransaccionTo /*implements Comparable<LocalDateTime>*/{

	private LocalDateTime fecha;
	private String tipo;
	private BigDecimal monto;
	
	//SET y GET
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	
}
