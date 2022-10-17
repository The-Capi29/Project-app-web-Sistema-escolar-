package com.Escolar.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table (name="Alumnos")
public class Alumnos {
	
	@Column(name="idAlumno")
	private int codigo;
	@Column(name="valorCodigo")
	private int valorCod;
	@Column(name="nombres")
	private String nombres;
	@Column(name="apellidos")
	private String apellidos;
	@Column(name="documentoIdentidad")
	private String documento;
	@Column(name="fechaNacimiento")
	private Date fec_nacimiento;
	@Column(name="idGenero")
	private int genero;
	@Column(name="ciudad")
	private String ciudad;
	@Column(name="direcion")
	private String direccion;
	@Column(name="fechaRegistro")
	private Date fec_registro;
	
}
