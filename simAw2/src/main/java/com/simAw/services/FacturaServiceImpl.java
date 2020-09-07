package com.simAw.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simAw.models.Factura;
import com.simAw.repository.FacturaRepository;

@Service
public class FacturaServiceImpl implements FacturaService{

	@Autowired
	FacturaRepository repo;

	@Override
	public Factura obtenerFactId(int facturaid) {
		// TODO Auto-generated method stub
		return repo.getOne(facturaid);
	}

	


	


}
