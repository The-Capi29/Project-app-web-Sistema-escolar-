package com.Escolar.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Escolar.Repository.GeneroRepository;
import com.Escolar.entity.Genero;

@Service
public class GeneroService {
	@Autowired
	private GeneroRepository repge;
	
	public List<Genero> listarGenero(){
		
		return repge.findAll();
	}
	
}
