package com.simAw.services;

import java.util.List;

import com.simAw.entity.Ciudades;



public interface CiudadesService {
	
	public List<Ciudades> listCiudades();
	public Ciudades obtenerCiudadId(Long id);
	public Ciudades saveCiudad(Ciudades ciudad);
	public void deleteCiudad(Long id);

}
