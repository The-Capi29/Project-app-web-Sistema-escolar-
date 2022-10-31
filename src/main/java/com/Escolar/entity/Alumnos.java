package com.Escolar.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table (name="tb_alumno")
public class Alumnos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_alumno")
	private int cod_alumno;
	@Column(name="alu_nombre")
	private String nombre;
	@Column(name="alu_apellidos")
	private String apellido;
	@Column(name="alu_dni")
	private String dni;
	@Column(name="alu_fecha_nacimiento")
	private Date fechaNacimiento;
	
	@ManyToOne
	@JoinColumn(name="cod_genero")
	private Genero genero;
	
	@Column(name="alu_ciudad")
	private String ciudad;
	@Column(name="alu_direccion")
	private String direccion;
	
	
	
	
	
	public int getCod_alumno() {
		return cod_alumno;
	}
	public void setCod_alumno(int cod_alumno) {
		this.cod_alumno = cod_alumno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	
}
