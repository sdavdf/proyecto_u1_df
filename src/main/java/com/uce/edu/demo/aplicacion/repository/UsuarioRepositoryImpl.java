package com.uce.edu.demo.aplicacion.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.aplicacion.modelo.Usuario;

@Repository
public class UsuarioRepositoryImpl implements IUsuarioRepository{

	@Override
	public void insertarUsuario(Usuario u) {
		// TODO Auto-generated method stub
		System.out.println("Se ha creado el usuario:" + u);
	}

	@Override
	public Usuario buscarUsuario(String apellido) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base el usuario: " + apellido);
		Usuario u = new Usuario();
		u.setApellido(apellido);
		return u;
	}

	@Override
	public void actualizarUsuario(Usuario u) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base el usuario: " + u);
	}

	@Override
	public void eliminarUsuario(String apellido) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base el usuario: " + apellido);
	}

}
