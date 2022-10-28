package com.tuempresa.claseuml.modelo;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Pasajero extends Identificable{

	@Column(length = 32)
	String nombre;
	
	@Column
	int numElementos;
 
}
