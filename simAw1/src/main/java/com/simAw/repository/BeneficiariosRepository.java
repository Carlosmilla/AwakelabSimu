package com.simAw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simAw.entity.Beneficiarios;

@Repository
public interface BeneficiariosRepository extends JpaRepository<Beneficiarios, Long>{

}
