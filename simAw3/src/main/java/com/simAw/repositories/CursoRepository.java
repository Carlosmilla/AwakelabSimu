package com.simAw.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simAw.models.Curso;


@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{

	

}
