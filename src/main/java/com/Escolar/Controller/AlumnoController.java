package com.Escolar.Controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Escolar.Service.AlumnoService;
import com.Escolar.Service.GeneroService;
import com.Escolar.entity.Alumnos;
import com.Escolar.entity.Genero;

@Controller
@RequestMapping("/Alumnos")
public class AlumnoController {

	@Autowired
	private AlumnoService serviceAlumno;
	
	@Autowired
	private GeneroService serviceGenero;
	
	@RequestMapping("/lista")
	public String list(Model model) {
		model.addAttribute("estudiantes", serviceAlumno.listAlumno());
		model .addAttribute("generos", serviceGenero.listarGenero());
	return "Estudiante";
	}
	
	@RequestMapping("/registrar")
	public String Registrar(@RequestParam("cod_alumno") Integer cod,@RequestParam("nombre") String nom,
			@RequestParam("apellido") String ape,@RequestParam("dni") String DNI,
			@RequestParam("fechaNacimiento") Date fecha,@RequestParam("genero") int codge, RedirectAttributes redirect,
			@RequestParam("ciudad") String ciud,@RequestParam("direccion") String dire) {
		
		try {
			Alumnos alu= new Alumnos();
			alu.setCod_alumno(cod);
			alu.setNombre(nom);
			alu.setApellido(ape);
			alu.setDni(DNI);
			alu.setFechaNacimiento(fecha);
			Genero ge= new Genero();
			ge.setCod_genero(codge);
			alu.setGenero(ge);
			serviceAlumno.guardar(alu);

			if(cod==0)
				//crear atributo
				redirect.addFlashAttribute("MENSAJE","Alumno registrado");
			else
				redirect.addFlashAttribute("MENSAJE","Alumno actualizado");
			
		} catch (Exception e) {
			redirect.addFlashAttribute("MENSAJE","Error en la grabación");
			e.printStackTrace();
		}
		
		return "redirect:/Alumnos/lista";
	}
	@RequestMapping("/actualizar")
	public String actualizar(@RequestParam("cod_alumno") Integer cod,@RequestParam("nombre") String nom,
			@RequestParam("apellido") String ape,@RequestParam("dni") String DNI,
			@RequestParam("fechaNacimiento") Date fecha,@RequestParam("genero") int codge, RedirectAttributes redirect,
			@RequestParam("ciudad") String ciud,@RequestParam("direccion") String dire) {
		
		try {
			Alumnos alu = new Alumnos();
			alu.setCod_alumno(cod);
			alu.setNombre(nom);
			alu.setApellido(ape);
			alu.setDni(DNI);
			alu.setFechaNacimiento(fecha);
			Genero ge= new Genero();
			ge.setCod_genero(codge);
			alu.setGenero(ge);
			serviceAlumno.update(alu);
			redirect.addFlashAttribute("MENSAJE","Alumno actualizado");
		} catch (Exception e) {
			redirect.addFlashAttribute("MENSAJE","Error en la actualización");
			e.printStackTrace();
		}		
		return "redirect:/Alumnos/lista";
	}
	
	@RequestMapping("/eliminar")
	public String eliminar(@RequestParam("codigo") int cod,RedirectAttributes redirect) {
		
		try {
			serviceAlumno.eliminar(cod);
			redirect.addFlashAttribute("MENSAJE","Alumno eliminado");
		} catch (Exception e) {
			redirect.addFlashAttribute("MENSAJE","Error en la eliminación");
			e.printStackTrace();
		}
		return "redirect:/Alumnos/lista";
	}
	
	
	@RequestMapping("/buscar")
	@ResponseBody
	public Alumnos buscar(@RequestParam("codigo") Integer cod) {
		return serviceAlumno.buscarID(cod);
	}
	
}
