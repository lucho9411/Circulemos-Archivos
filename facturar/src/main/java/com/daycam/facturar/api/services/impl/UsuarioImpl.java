package com.daycam.facturar.api.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.daycam.facturar.api.commons.MHelpers;
import com.daycam.facturar.api.dto.UsuarioDto;
import com.daycam.facturar.api.entities.Usuario;
import com.daycam.facturar.api.repositories.UsuarioRepositoriy;
import com.daycam.facturar.api.services.UsuarioService;

@Component
public class UsuarioImpl implements UsuarioService {

	@Autowired
	private UsuarioRepositoriy usuarioRepository;
	
	/**
	 * Metodo para la creación en base de datos de un usuario mediante 
	 * @param usuarioDto
	 */
	
	@Override
	public Usuario save(UsuarioDto usuarioDto) {
		try {
			if (usuarioDto != null) {
				Usuario usuario = MHelpers.modelMapper().map(usuarioDto, Usuario.class);
				return this.usuarioRepository.save(usuario);
			}
		} catch (Exception e) {
			System.out.print("error save user: " + e.getLocalizedMessage());
			return null;
		}
		
		return null;
	}

	@Override
	public List<UsuarioDto> findUsuarios() {
		
		List<UsuarioDto> dto = new ArrayList<>();

        Iterable<Usuario> usuarios = this.usuarioRepository.findAll();

        for (Usuario usuarioRecord : usuarios) {

            UsuarioDto usuarioDTO = MHelpers.modelMapper().map(usuarioRecord, UsuarioDto.class);

            dto.add(usuarioDTO);

        }

        return dto;
	}

}
