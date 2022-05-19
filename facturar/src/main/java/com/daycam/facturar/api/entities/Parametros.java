package com.daycam.facturar.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.daycam.facturar.api.commons.Base;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@Entity
@Table(name = "parametros")
public class Parametros extends Base{
	
	/**
	 * Entidad parametros de la aplicación
	 * 
	 * @author eevalero
	 * @version 1.0
	 */
	private static final long serialVersionUID = -291215640272618418L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "parametrosIdGenerator")
	@SequenceGenerator(name = "parametrosIdGenerator", initialValue = 1, allocationSize = 1, sequenceName = "parametros_id_seq")
	private int id;
	
	@NotNull(message = "no puede ser nulo")
	@Size(min = 4, max = 50, message = "debe estar entre 4 y 50 caracteres")
	@Column(nullable = false, length = 50)
	private String entidad;
	
	@NotNull(message = "no puede ser nulo")
	@Size(min = 4, max = 50, message = "debe estar entre 4 y 50 caracteres")
	@Column(nullable = false, length = 50)
	@NotNull(message = "no puede ser nulo")
	private String atributo;
	
	@NotNull(message = "no puede ser nulo")
	@Size(min = 4, max = 50, message = "debe estar entre 4 y 50 caracteres")
	@Column(nullable = false, length = 50)
	@NotNull(message = "no puede ser nulo")
	private String valor;
	
	
	@Column(nullable = false)
	@NotNull(message = "no puede ser nulo")
	private int codigo;
	
	
	/**
	 * Constructor de la clase parametros
	 */
	
	public Parametros() {
		super();
	}
	
	/**
	 * Getters & Setters variables de parametros
	 * @return
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
