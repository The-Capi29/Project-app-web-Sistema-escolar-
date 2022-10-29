package com.Escolar.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_gradoSeccion")
public class GradoSeccion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="gra_IdGradoSeccion")
	private Integer codigoGrado;
	@Column(name="gra_descripcionGrado")
	private String desGrado;
	@Column(name="gra_descripcionSeccion")
	private String desSeccion;
}
