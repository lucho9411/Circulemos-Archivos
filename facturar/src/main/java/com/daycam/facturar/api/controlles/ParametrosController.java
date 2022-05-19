package com.daycam.facturar.api.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.daycam.facturar.api.dto.ParametrosDto;
import com.daycam.facturar.api.entities.Parametros;
import com.daycam.facturar.api.services.impl.ParametrosImpl;

@CrossOrigin("*")
@RestController
@RequestMapping("/parametros")
public class ParametrosController {
	
	@Autowired
	private ParametrosImpl parametrosImpl;
	
	/**
	 * Metodos POST 
	 * @param parametro
	 * @return
	 */
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String saveBirthCertificate(@RequestBody Parametros parametro) {

        return parametrosImpl.save(parametro);

    }
	
	/**
	 * Metodos GET
	 * @return
	 */
	
	@GetMapping(value = "/tipo_usuario", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<ParametrosDto> getTipoUsuario() {
		return this.parametrosImpl.findAtributoTipoUsuario("tipo_usuario");
	}
	
	@GetMapping(value = "/tipo_Documento", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<ParametrosDto> getTipoDocumento() {
		return this.parametrosImpl.findAtributoTipoUsuario("tipo_documento");
	}
	
	@GetMapping(value = "/tipo_estado", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<ParametrosDto> getTipoEstado() {
		return this.parametrosImpl.findAtributoTipoUsuario("estado");
	}
}
