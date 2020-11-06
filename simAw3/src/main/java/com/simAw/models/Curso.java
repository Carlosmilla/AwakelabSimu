package com.simAw.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Curso {
	
	@Id
	private int idcurso;
	private String nombre;
	
	@OneToMany(mappedBy = "cursoid", cascade=CascadeType.ALL, orphanRemoval = true)
	private Set<Alumno> alumno = new HashSet<Alumno>();
	
	
}
