package com.simAw.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Doctores {

	@Id
	private int idDoctor;
	private String rutDoctor;
	private String nombre;
	private String apellido;
	
	@OneToMany(mappedBy = "iddoctor", fetch = FetchType.LAZY)
	private Set<Agendas> agendas;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "idespecialidad")
	private Especialidades idespecialidad;	
	
}
