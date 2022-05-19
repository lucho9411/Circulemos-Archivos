package com.daycam.facturar.api.dto;

import java.io.Serializable;

import com.daycam.facturar.api.entities.Parametros;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UsuarioDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3718260430613740930L;
	
	@JsonProperty("id")
	private int id;
	@JsonProperty("fullName")
	private String fullName;
	@JsonProperty("documento")
	private String documento;
	@JsonProperty("direccion")
	private String direccion;
	@JsonProperty("telefonoFijo")
	private String telefonoFijo;
	@JsonProperty("telefonoCelular")
	private String telefonoCelular;
	@JsonProperty("email")
	private String email;
	@JsonProperty("parametrosTipoDocumento")
	private Parametros parametrosTipoDocumento;
	@JsonProperty("parametrosTipoUsuario")
	private Parametros parametrosTipoUsuario;
	
	/**
	 * Getters and setters
	 * @return
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefonoFijo() {
		return telefonoFijo;
	}
	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}
	public String getTelefonoCelular() {
		return telefonoCelular;
	}
	public void setTelefonoCelular(String telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Parametros getParametrosTipoDocumento() {
		return parametrosTipoDocumento;
	}
	public void setParametrosTipoDocumento(Parametros parametrosTipoDocumento) {
		this.parametrosTipoDocumento = parametrosTipoDocumento;
	}
	public Parametros getParametrosTipoUsuario() {
		return parametrosTipoUsuario;
	}
	public void setParametrosTipoUsuario(Parametros parametrosTipoUsuario) {
		this.parametrosTipoUsuario = parametrosTipoUsuario;
	}
	
	
	
	
}
