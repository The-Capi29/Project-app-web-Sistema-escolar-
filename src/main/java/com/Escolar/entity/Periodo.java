package com.Escolar.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_periodo")
public class Periodo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pe_IdPeriodo")
	private Integer codigoPeriodo;
	@Column(name="pe_Descripcion")
	private String  Descripcion;
	@Column(name="pe_FechaInicio")
	private Date FechaInicio;
	@Column(name="pe_FechaFin")
	private Date FechaFin;
	
}
