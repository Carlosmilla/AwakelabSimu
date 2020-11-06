package com.simAw.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simAw.entity.Beneficiarios;
import com.simAw.repository.BeneficiariosRepository;

@Service
public class BeneficiariosServiceImpl implements BeneficiariosService{

	@Autowired
	private BeneficiariosRepository beneRepo;
	
	public void setBeneRepo(BeneficiariosRepository beneRepo) {
		this.beneRepo = beneRepo;
	}
	
	@Override
	public List<Beneficiarios> listBeneficiarios() {
		return beneRepo.findAll();
	}

	@Override
	public Beneficiarios obtenerBeneficiarioId(Long id) {
		return beneRepo.getOne(id);
	}

	@Override
	public Beneficiarios saveBeneficiario(Beneficiarios beneficiario) {
		return beneRepo.save(beneficiario);
	}

	@Override
	public void deleteBeneficiario(Long id) {
		beneRepo.deleteById(id);
	}

}
