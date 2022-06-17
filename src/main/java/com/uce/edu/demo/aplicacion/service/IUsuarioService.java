package com.uce.edu.demo.aplicacion.service;

import com.uce.edu.demo.aplicacion.modelo.Usuario;

public interface IUsuarioService {

	public void insertarUsuario(Usuario u);
	
	public Usuario buscarUsuario(String apellido);
	
	public void actualizarUsuario(Usuario u);
		
	public void eliminarUsuario(String apellido);
}
