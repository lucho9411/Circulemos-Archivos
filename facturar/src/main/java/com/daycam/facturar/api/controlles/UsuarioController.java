package com.daycam.facturar.api.controlles;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.daycam.facturar.api.dto.UsuarioDto;
import com.daycam.facturar.api.entities.Usuario;
import com.daycam.facturar.api.services.impl.UsuarioImpl;

@CrossOrigin("*")
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	
	@Autowired
	private UsuarioImpl usuarioImpl;
	/**
	 * Metodos POST 
	 * @param parametro
	 * @return
	 */
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Usuario> saveUsuario(@RequestBody UsuarioDto usuarioDto) {

        Usuario usuario = this.usuarioImpl.save(usuarioDto);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setLocation(ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(usuario.getId())
                .toUri());
        return new ResponseEntity<>(httpHeaders, HttpStatus.CREATED);
    }
	
	
	/**
	 * Metodo para consultar todos los usuarioscreados
	 * @return
	 */
	 @GetMapping(value = "/allUser", produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Object> index() {

	        return ResponseEntity.ok(this.usuarioImpl.findUsuarios());

	    }

}
