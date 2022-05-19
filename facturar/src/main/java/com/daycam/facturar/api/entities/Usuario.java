package com.daycam.facturar.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.daycam.facturar.api.commons.Base;

@Entity
@Table(name = "usuario")
public class Usuario extends Base{
	
	/**
	 * Entidad parametros de la aplicación
	 * 
	 * @author eevalero
	 * @version 1.0
	 */
	private static final long serialVersionUID = 3054672124798720556L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ususarioIdGenerator")
	@SequenceGenerator(name = "usuarioIdGenerator", initialValue = 1, allocationSize = 1, sequenceName = "usuario_id_seq")
	private int id;
	
	@NotNull(message = "no puede ser nulo")
	@Size(min = 4, max = 255, message = "debe estar entre 4 y 255 caracteres")
	@Column(name = "full_name", nullable = false, length = 255)
	private String fullName;
	
	@NotNull(message = "no puede ser nulo")
	@Size(min = 4, max = 20, message = "debe estar entre 4 y 20 caracteres")
	@Column(nullable = false, length = 20)
	private String documento;
	
	@Column(nullable = true, length = 50)
	private String direccion;
	
	@Column(name = "telefono_fijo", nullable = true, length = 7)
	private String telefonoFijo;
	
	@Column(name = "telefono_celular", nullable = true, length = 10)
	private String telefonoCelular;
	
	@Column(nullable = true, length = 50)
	private String loing;
	
	@Column(nullable = true, length = 50)
	private String pass;
	
	@NotNull(message = "no puede ser nulo")
	@Size(min = 4, max = 20, message = "debe estar entre 4 y 20 caracteres")
	@Column(nullable = false, length = 20)
	private String email;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parametros_tipo_documento_id", nullable = false)
	private Parametros parametrosTipoDocumento;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parametros_tipo_usuario_id", nullable = false)
	private Parametros parametrosTipoUsuario;
	
	
	/**
	 * Constructor de la clase usuario
	 */
	public Usuario() {
		super();
	}

	/**
	 * Getters & Setters variables de usuario
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

	public String getLoing() {
		return loing;
	}

	public void setLoing(String loing) {
		this.loing = loing;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Parametros getParametrosTipoDocumento() {
		return parametrosTipoDocumento;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
