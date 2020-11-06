package com.simAw.entity;

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
public class Beneficiarios {

	@Id
	private Long beneficiarioid;
	private String nombre;
	private int edad;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "ciudadid")
	private Ciudades ciudad;
	
	@OneToMany(mappedBy = "beneficiario")
	private Set<Ayudas> ayudas;
}
