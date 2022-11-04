package com.tuempresa.claseuml.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter

public class Aerolinea extends Identificable{
	@Required
	@Column ( length  =32)
	String nombre;
	
@Required
	@ManyToOne(  
			fetch=FetchType.LAZY, 
			optional=true)  
			@DescriptionsList  
			Pais país;  
 
	
}
