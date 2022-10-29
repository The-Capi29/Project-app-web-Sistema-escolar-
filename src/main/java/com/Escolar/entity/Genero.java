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
	@Column(name="idGenero")
	private Integer cod_genero;
	@Column(name="genero")
	private String descripcion;
	
	@JsonIgnore
	@OneToMany(mappedBy = "genero")
	public List<Alumnos> listaAlumno;
	public List<Docentes> listaDocente;

	
	
	
}
