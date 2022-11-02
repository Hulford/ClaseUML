package com.tuempresa.claseuml.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Tripulacion extends Identificable{

	@Column(length = 32)
	String nombre;
	
	@Column
	int numElementos;
  
	
	@ManyToOne(  
			fetch=FetchType.LAZY,  
			optional=true)  
			@DescriptionsList  
			Aerolinea aerolinea; 
 
	@OneToMany 
	 
	Collection<Empleado>empleados;
		 
	
	
}
