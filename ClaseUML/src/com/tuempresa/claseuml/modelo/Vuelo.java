package com.tuempresa.claseuml.modelo;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Vuelo extends Identificable{

	@Column(length = 4)
	int anyo;
	
	@Column (length = 32)
	String CiudadOrigen;
	
	@Column(length = 32)
	String CiudadDestino;
	
	
}
