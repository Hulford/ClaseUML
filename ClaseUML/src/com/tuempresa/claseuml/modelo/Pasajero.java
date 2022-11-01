package com.tuempresa.claseuml.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Pasajero extends Identificable{
 
	@Column
	int numeroAsiento;
 
	@Money  
	float CostoBoleto;
	
	@OneToOne(fetch = FetchType.LAZY, optional = true)
	Persona persona;
 
}
