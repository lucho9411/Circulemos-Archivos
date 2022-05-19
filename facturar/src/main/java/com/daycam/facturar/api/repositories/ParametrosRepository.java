package com.daycam.facturar.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daycam.facturar.api.entities.Parametros;

@Repository
public interface ParametrosRepository extends JpaRepository<Parametros, Long>{
	
	List<Parametros> findByAtributo(String nombreAtributo);
}
