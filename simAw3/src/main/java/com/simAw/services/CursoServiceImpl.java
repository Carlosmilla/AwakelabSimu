package com.simAw.services;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simAw.models.Curso;
import com.simAw.repositories.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService{

	@Autowired
	CursoRepository repo;

	@Override
	public Collection<Curso> obtenerCursos() {
		return (Collection<Curso>)repo.findAll();
	}

	@Override
	public Curso obtenerCursoId(int idcurso) {
		return repo.getOne(idcurso);
	}



}
