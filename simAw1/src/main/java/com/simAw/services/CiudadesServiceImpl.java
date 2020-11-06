package com.simAw.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simAw.entity.Ciudades;
import com.simAw.repository.CiudadesRepository;

@Service
public class CiudadesServiceImpl implements CiudadesService{

	@Autowired
	private CiudadesRepository ciudadRepo;
	
	public void setCiudadRepo(CiudadesRepository ciudadRepo) {
		this.ciudadRepo = ciudadRepo;
	}
	
	@Override
	public List<Ciudades> listCiudades() {
		return ciudadRepo.findAll();
	}

	@Override
	public Ciudades obtenerCiudadId(Long id) {
		return ciudadRepo.getOne(id);
	}

	@Override
	public Ciudades saveCiudad(Ciudades ciudad) {
		return ciudadRepo.save(ciudad);
	}

	@Override
	public void deleteCiudad(Long id) {
		ciudadRepo.deleteById(id);
	}

}
