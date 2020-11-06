package com.simAw.services;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simAw.models.Alumno;
import com.simAw.models.Curso;
import com.simAw.repositories.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService{

	@Autowired
	AlumnoRepository repo;

	@Override
	public Alumno findByIdCurso(int cursoid) {
		return repo.getOne(cursoid);
	}

	@Override
	public Optional<Alumno> obtenerCurso(int cursoid) {
		return repo.findById(cursoid);
	}

	@Override
	public Collection<Alumno> findAll() {
		return repo.findAll();
	}
	
	



}
