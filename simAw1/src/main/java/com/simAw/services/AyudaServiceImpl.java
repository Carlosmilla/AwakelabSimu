package com.simAw.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simAw.entity.Ayudas;
import com.simAw.repository.AyudasRepository;

@Service
public class AyudaServiceImpl implements AyudasService{

	@Autowired
	private AyudasRepository ayudaRepo;
	
	public void setAyudaRepo(AyudasRepository ayudaRepo) {
		this.ayudaRepo = ayudaRepo;
	}
	
	@Override
	public List<Ayudas> listAyudas() {
		return ayudaRepo.findAll();
	}

	@Override
	public Ayudas obtenerAyudaId(long id) {
		return ayudaRepo.getOne(id);
	}

	@Override
	public Ayudas saveAyuda(Ayudas ayuda) {
		return ayudaRepo.save(ayuda);
	}

	@Override
	public void deleteAyuda(long id) {
        ayudaRepo.deleteById(id);
	}

}
