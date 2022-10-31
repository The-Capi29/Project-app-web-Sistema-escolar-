package com.Escolar.Entity;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Escolar.Service.AlumnoService;
import com.Escolar.entity.Alumnos;

@SpringBootTest
class ProyectoSistemaEscolarApplicationTests {
	
	@Autowired
	private AlumnoService service;

	@Test
	void contextLoads() {
		List<Alumnos> data=service.listAlumno();
		for(Alumnos t:data)
			System.out.println(t.getCod_alumno()+"--"+ t.getNombre()+"--"+t.getApellido()+"--"+t.getDni()+"--"+t.getFechaNacimiento()+"--"+t.getGenero().getDescripcion()+"---"+t.getCiudad()+"--"+t.getDireccion());
	}

}
