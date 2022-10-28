package com.tuempresa.claseuml.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Empleado extends Identificable{

	
	@Column(length = 64)
	@Required
	String nombres;
	
	@Column(length = 64)
	@Required
	String apellidos;
	
	 @Files @Required
	    @Column (length = 32)
	    String fotos; 

	 
	 @Embedded @NoFrame
		Direccion direccion;
	 
		@ManyToOne( // La referencia se almacena como una relación en la base de datos
				fetch=FetchType.LAZY, // La referencia se carga bajo demanda
				optional=true) // La referencia puede estar sin valor
				@DescriptionsList // Así la referencia se visualiza usando un combo
				Tripulacion tripulacion; // Una referencia Java convencional
}
