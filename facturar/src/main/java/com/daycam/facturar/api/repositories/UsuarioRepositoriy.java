package com.daycam.facturar.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daycam.facturar.api.entities.Usuario;

public interface UsuarioRepositoriy extends JpaRepository<Usuario, Long>{
	
	
}
