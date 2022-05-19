package com.daycam.facturar.api.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.daycam.facturar.api.commons.Base;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@Entity
@Table(name = "productos")
public class Productos extends Base{
	
	/**
	 * Entidad productos de la aplicación
	 * 
	 * @author eevalero
	 * @version 1.0
	 */
	private static final long serialVersionUID = 7595551042203605864L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "productosIdGenerator")
	@SequenceGenerator(name = "productosIdGenerator", initialValue = 1, allocationSize = 1, sequenceName = "productos_id_seq")
	private Long id;
	
	@NotNull(message = "no puede ser nulo")
	@Size(min = 2, max = 20, message = "debe estar entre 4 y 20 caracteres")
	@Column(nullable = false, length = 20)
	private String codigo;
	
	@NotNull(message = "no puede ser nulo")
	@Size(min = 4, max = 50, message = "debe estar entre 4 y 50 caracteres")
	@Column(nullable = false, length = 50)
	private String nombre;
	
	@NotNull(message = "no puede ser nulo")
	@Size(min = 4, max = 100, message = "debe estar entre 4 y 100 caracteres")
	@Column(nullable = false, length = 100)
	private String descripcion;
	
	@NotNull(message = "no puede ser nulo")
	@Size(min = 4, max = 20, message = "debe estar entre 4 y 20 caracteres")
	@Column(nullable = false, length = 20)
	private String serial;
	
	@NotNull(message = "no puede ser nulo")
	@Column(nullable = false, length = 20)
	private Long cantidad;
	
	@NotNull(message = "no puede ser nulo")
	@Column(nullable = false)
	private Float gramos;
	
	@NotNull(message = "no puede ser nulo")
	@Column(nullable = false)
	private Float costo;
	
	@NotNull(message = "no puede ser nulo")
	@Column(name = "costo_venta", nullable = false)
	private Float costoVenta;
	
	@NotNull(message = "no puede ser nulo")
	@Column(name = "costo_venta2", nullable = false)
	private Float costoVenta2;
	
	@NotNull(message = "no puede ser nulo")
	@Column(name = "costo_venta3", nullable = false)
	private Float costoVenta3;
	
	
	private int iva;
	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private Parametros linea;
	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private Parametros bodega;
	
	/**
	 * Constructor de la clase productos
	 */
	public Productos() {
		super();
	}
	
	/**
	 * Getters & Setters variables de parametros
	 * @return
	 */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public Long getCantidad() {
		return cantidad;
	}

	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

	public Float getGramos() {
		return gramos;
	}

	public void setGramos(Float gramos) {
		this.gramos = gramos;
	}

	public Float getCosto() {
		return costo;
	}

	public void setCosto(Float costo) {
		this.costo = costo;
	}

	public Float getCostoVenta() {
		return costoVenta;
	}

	public void setCostoVenta(Float costoVenta) {
		this.costoVenta = costoVenta;
	}

	public Float getCostoVenta2() {
		return costoVenta2;
	}

	public void setCostoVenta2(Float costoVenta2) {
		this.costoVenta2 = costoVenta2;
	}

	public Float getCostoVenta3() {
		return costoVenta3;
	}

	public void setCostoVenta3(Float costoVenta3) {
		this.costoVenta3 = costoVenta3;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public Parametros getLinea() {
		return linea;
	}

	public void setLinea(Parametros linea) {
		this.linea = linea;
	}

	public Parametros getBodega() {
		return bodega;
	}

	public void setBodega(Parametros bodega) {
		this.bodega = bodega;
	}
	
	

}
