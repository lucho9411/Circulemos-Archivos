package com.daycam.facturar.api.dto;

import java.io.Serializable;

public class ParametrosDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7467844802415085386L;

	private Long id;
	private String entidad;
	private String atributo;
	private String valor;
	private int codigo;
	
	/**
	 * Getters and Setters de los parametros a mostrar
	 * @return
	 */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEntidad() {
		return entidad;
	}
	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}
	public String getAtributo() {
		return atributo;
	}
	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	
}
