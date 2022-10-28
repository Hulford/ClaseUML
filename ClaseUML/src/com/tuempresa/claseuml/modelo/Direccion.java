package com.tuempresa.claseuml.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Embeddable @Getter @Setter
public class Direccion {

	@Column(length = 30)
	String viaPublica;
	
	@Column (length = 5)
	int CodigoPostal;
	
	@Column(length = 20)
	String municipio;
	
	@Column(length = 30)
	String provincia;
	
	@ManyToOne( // La referencia se almacena como una relación en la base de datos
			fetch=FetchType.LAZY, // La referencia se carga bajo demanda
			optional=true) // La referencia puede estar sin valor
			@DescriptionsList // Así la referencia se visualiza usando un combo
			Pais pais; // Una referencia Java convencional
	
}
