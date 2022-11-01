package com.tuempresa.claseuml.modelo;

 

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Pasajero extends Identificable{
 
	@Column(length = 32)
	int numeroAsiento;
 
	@Money
	@Column(length = 32)
	float precio;
	
	@OneToOne(fetch = FetchType.LAZY, optional = true)
	Persona persona;
 
}
