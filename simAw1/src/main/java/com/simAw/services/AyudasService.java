package com.simAw.services;

import java.util.List;

import com.simAw.entity.Ayudas;

public interface AyudasService {

	public List<Ayudas> listAyudas();
	public Ayudas obtenerAyudaId(long id);
	public Ayudas saveAyuda(Ayudas ayuda);
	public void deleteAyuda(long id);
}
