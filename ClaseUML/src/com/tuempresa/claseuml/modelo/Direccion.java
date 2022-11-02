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
	
	@ManyToOne(  
			fetch=FetchType.LAZY, 
			optional=true)  
			@DescriptionsList  
			Municipio municipio;  
	
	@Column(length = 30)
	String provincia;
	
	@ManyToOne(  
			fetch=FetchType.LAZY, 
			optional=true) 
			@DescriptionsList  
			Pais pais;  
	
}
