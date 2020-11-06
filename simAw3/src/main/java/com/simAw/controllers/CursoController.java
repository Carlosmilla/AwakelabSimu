package com.simAw.controllers;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simAw.models.Alumno;
import com.simAw.models.Curso;
import com.simAw.repositories.AlumnoRepository;
import com.simAw.services.AlumnoServiceImpl;
import com.simAw.services.CursoServiceImpl;

@Controller
public class CursoController {

	@Autowired
	CursoServiceImpl curso;
	@Autowired
	AlumnoServiceImpl alum;
	
	@RequestMapping("/listaCursos")
	public String inicioCursos(Model model) {
		Collection<Curso> cur = curso.obtenerCursos();
		model.addAttribute("cur", cur);
		return "cursos";
	}

	@RequestMapping("/verAlumnos/{idcurso}")
	public String verAlumnos(Model model, @PathVariable int idcurso) {
	    Set<Alumno> cur2 = curso.obtenerCursoId(idcurso).getAlumno();
	    model.addAttribute("alumno", cur2);
		return "alumnos";
	}
}
