package com.simAw.entity;

import java.util.Set;

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
public class Ciudades {

	@Id
	private Long id;
	private String nombreciudad;
	@OneToMany(mappedBy = "ciudad")
	private Set<Beneficiarios> beneficiarios;
}
