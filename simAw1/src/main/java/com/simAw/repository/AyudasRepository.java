package com.simAw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simAw.entity.Ayudas;

@Repository
public interface AyudasRepository extends JpaRepository<Ayudas, Long>{


}
