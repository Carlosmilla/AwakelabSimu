package com.demo.service;

import java.util.Collection;

import com.demo.model.Auto;

public interface AutoService {

	public abstract void insertar(Auto auto);
	public abstract void actualizar(Auto auto);
	public abstract void eliminar(Integer id_auto);
	public abstract Auto findById(Integer id_auto);
	public abstract Collection<Auto> findAll();
}
