package com.simAw.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Especialidades {

	@Id
	private int idespecialidad;
	private String descripcion;
	
	@OneToMany(mappedBy = "idespecialidad", fetch = FetchType.LAZY)
	private Set<Doctores> doctores;
}
