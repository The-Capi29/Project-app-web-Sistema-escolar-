package com.Escolar.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Escolar.Repository.AlumnoRepository;
import com.Escolar.entity.Alumnos;

@Service
public class AlumnoService {

	@Autowired
	private AlumnoRepository repoalu;
	
	
	
	public List<Alumnos> listAlumno(){
		
		return repoalu.findAll();
	}
	
	public Alumnos buscarID(Integer cod) {
		
		
		return repoalu.findById(cod).orElse(null);
	}
	
	
	public void guardar(Alumnos obj) {
		repoalu.save(obj);
	}
	
	public void update(Alumnos obj) {
		
		repoalu.save(obj);
	}
	
	public void eliminar(Integer cod) {
		repoalu.deleteById(cod);
	}
}
