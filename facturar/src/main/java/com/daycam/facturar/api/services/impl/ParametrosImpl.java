package com.daycam.facturar.api.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.daycam.facturar.api.commons.MHelpers;
import com.daycam.facturar.api.dto.ParametrosDto;
import com.daycam.facturar.api.entities.Parametros;
import com.daycam.facturar.api.repositories.ParametrosRepository;
import com.daycam.facturar.api.services.ParametrosService;

@Component
public class ParametrosImpl implements ParametrosService{

	@Autowired
	private ParametrosRepository parametrosRepository;
	
	@Override
	public String save(Parametros parametro) {
		if(parametro != null) {
			this.parametrosRepository.save(parametro);
			return "Se ha insertado correctamente el registro";
		}else {
			return "No se ha insertado correctamente el registro";
		}	
		
	}

	@Override
	public List<ParametrosDto> findAtributoTipoUsuario(String nombreAtributo) {
		
		List<ParametrosDto> dto = new ArrayList<>();

        Iterable<Parametros> parametrosIterable = this.parametrosRepository.findByAtributo(nombreAtributo);

        for (Parametros parametros : parametrosIterable) {

            ParametrosDto parametrosDto = MHelpers.modelMapper().map(parametros, ParametrosDto.class);

            dto.add(parametrosDto);

        }

        return dto;
	}
	
}
