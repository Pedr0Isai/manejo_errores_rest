package com.pruebaspring.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

	@Id
	@Column(name = "id_doc")
	private Long idDoc;
	@Column(name = "tipo_doc")
	private String tipoDoc;
	private String nombre;
	private String nombre2;
	private String apellido;
	private String apellido2;
	private String telefono;
	private String direccion;
	@Column(name = "cd_res")
	private String cdRes;

	public Long getIdDoc() {
		return this.idDoc;
	}

	public void setIdDoc(Long idDoc) {
		this.idDoc = idDoc;
	}

	public String getTipoDoc() {
		return this.tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre2() {
		return this.nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getApellido2() {
		return this.apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCdRes() {
		return this.cdRes;
	}

	public void setCdRes(String cdRes) {
		this.cdRes = cdRes;
	}

	@Override
	public String toString() {
		return String.format(
				"Cliente [idDoc=%s, tipoDoc=%s, nombre=%s, nombre2=%s, apellido=%s, apellido2=%s, telefono=%s, direccion=%s, cdRes=%s]",
				idDoc, tipoDoc, nombre, nombre2, apellido, apellido2, telefono, direccion, cdRes);
	}

}
