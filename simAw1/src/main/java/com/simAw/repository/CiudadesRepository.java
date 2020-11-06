package com.simAw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simAw.entity.Ciudades;

@Repository
public interface CiudadesRepository extends JpaRepository<Ciudades, Long>{

}
