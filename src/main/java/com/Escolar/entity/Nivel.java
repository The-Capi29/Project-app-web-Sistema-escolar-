package com.Escolar.entity;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_nivel")
public class Nivel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ni_IdNivel")
	private Integer codigoPeriodo;
	
	@ManyToOne
	@JoinColumn(name = "pe_IdPeriodo")
	private Periodo periodo;
	
	@Column(name="ni_DescripcionNivel")
	private String  descNivel;
	@Column(name="ni_DescripcionTurno")
	private String  descTurno;
	@Column(name="ni_HoraInicio")
	private Time horaInicio;
	@Column(name="ni_HoraFin")
	private Time horaFin;
}
