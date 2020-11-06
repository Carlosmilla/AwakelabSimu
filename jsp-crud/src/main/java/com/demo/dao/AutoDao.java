package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Auto;

@Repository
public interface AutoDao extends JpaRepository<Auto, Integer>{

}
