package com.simAw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simAw.models.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Integer>{

}
