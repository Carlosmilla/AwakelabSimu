package com.simAw.services;

import java.util.List;

import com.simAw.entity.Beneficiarios;

public interface BeneficiariosService {
	public List<Beneficiarios> listBeneficiarios();
	public Beneficiarios obtenerBeneficiarioId(Long id);
	public Beneficiarios saveBeneficiario(Beneficiarios beneficiario);
	public void deleteBeneficiario(Long id);

}
