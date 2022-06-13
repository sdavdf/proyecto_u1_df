package com.uce.edu.demo.mercado.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Producto {
	
	private String nombre;
	private BigDecimal precioDistribuidor;
	private Integer cantidad;
	private LocalDateTime fechaIngresoBodega;
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioDistribuidor=" + precioDistribuidor + ", fechaIngresoBodega="
				+ fechaIngresoBodega + ", cantidad=" + cantidad + "]";
	}

	//SET y GET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecioDistribuidor() {
		return precioDistribuidor;
	}

	public void setPrecioDistribuidor(BigDecimal precioDistribuidor) {
		this.precioDistribuidor = precioDistribuidor;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public LocalDateTime getFechaIngresoBodega() {
		return fechaIngresoBodega;
	}

	public void setFechaIngresoBodega(LocalDateTime fechaIngresoBodega) {
		this.fechaIngresoBodega = fechaIngresoBodega;
	}
	
	// SET Y GET
	



}
