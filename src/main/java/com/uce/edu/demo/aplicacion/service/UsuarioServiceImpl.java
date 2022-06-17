package com.uce.edu.demo.aplicacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.aplicacion.modelo.Usuario;
import com.uce.edu.demo.aplicacion.repository.IUsuarioRepository;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	private IUsuarioRepository iUsuarioRepository;
	
	@Override
	public void insertarUsuario(Usuario u) {
		// TODO Auto-generated method stub
		this.iUsuarioRepository.insertarUsuario(u);
	}

	@Override
	public Usuario buscarUsuario(String apellido) {
		// TODO Auto-generated method stub
		return this.iUsuarioRepository.buscarUsuario(apellido);
	}

	@Override
	public void actualizarUsuario(Usuario u) {
		// TODO Auto-generated method stub
		this.iUsuarioRepository.actualizarUsuario(u);
	}

	@Override
	public void eliminarUsuario(String apellido) {
		// TODO Auto-generated method stub
		this.iUsuarioRepository.eliminarUsuario(apellido);
	}

}
