package com.daycam.facturar.api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.daycam.facturar.api.dto.ParametrosDto;
import com.daycam.facturar.api.entities.Parametros;

@Service
public interface ParametrosService {
	
	String save(Parametros parametro);
	
	List<ParametrosDto> findAtributoTipoUsuario(String nombreAtributo);
}
