package com.simAw.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simAw.models.Categoria;
import com.simAw.repository.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService{

	@Autowired
	CategoriaRepository repo;

	@Override
	public Categoria findCatId(int categoriaid) {
		// TODO Auto-generated method stub
		return repo.getOne(categoriaid);
	}

	

}
