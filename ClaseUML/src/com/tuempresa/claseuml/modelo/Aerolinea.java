package com.tuempresa.claseuml.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter

public class Aerolinea extends Identificable{

	@Column ( length  =32)
	String nombre;
	
	@ManyToOne( // La referencia se almacena como una relación en la base de datos
			fetch=FetchType.LAZY, // La referencia se carga bajo demanda
			optional=true) // La referencia puede estar sin valor
			@DescriptionsList // Así la referencia se visualiza usando un combo
			Pais pais; // Una referencia Java convencional
 
	
}
