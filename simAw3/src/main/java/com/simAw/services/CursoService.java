package com.simAw.services;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.simAw.models.Curso;

public interface CursoService {

	
	public Collection<Curso> obtenerCursos();
	
	public Curso obtenerCursoId(int idcurso);
}
