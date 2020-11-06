package com.simAw.services;

import java.util.Collection;
import java.util.Optional;

import com.simAw.models.Alumno;
import com.simAw.models.Curso;

public interface AlumnoService {

	Alumno findByIdCurso(int cursoid);
	
	public Optional<Alumno> obtenerCurso(int cursoid);
	
	Collection<Alumno> findAll();
}
