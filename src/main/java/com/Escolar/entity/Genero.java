package com.Escolar.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tb_genero")
public class Genero {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_genero")
	private Integer cod_genero;
	@Column(name="genero")
	private String descripcion;
	
	@JsonIgnore
	@OneToMany(mappedBy = "genero")
	public List<Alumnos> listaAlumno;
	
	@JsonIgnore
	@OneToMany(mappedBy = "genero")
	public List<Docentes> listaDocente;

	public Integer getCod_genero() {
		return cod_genero;
	}

	public void setCod_genero(Integer cod_genero) {
		this.cod_genero = cod_genero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Alumnos> getListaAlumno() {
		return listaAlumno;
	}

	public void setListaAlumno(List<Alumnos> listaAlumno) {
		this.listaAlumno = listaAlumno;
	}

	public List<Docentes> getListaDocente() {
		return listaDocente;
	}

	public void setListaDocente(List<Docentes> listaDocente) {
		this.listaDocente = listaDocente;
	}

	
	
	
}
