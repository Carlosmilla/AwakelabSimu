package com.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "autos")
public class Auto implements Serializable{
	 
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id_auto;
	 private String modelo_auto;
	 private Double precio_auto;
	 private String propietario;
	 
	 @OneToMany(mappedBy = "auto")
	 private Collection<Reparacion> listaReparacion = new ArrayList<>();
	 
	 
	 
	 
	private static final long serialVersionUID = 1L;
	

}
