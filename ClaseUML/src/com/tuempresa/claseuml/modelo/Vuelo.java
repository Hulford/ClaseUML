package com.tuempresa.claseuml.modelo;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@Entity @Getter @Setter
public class Vuelo extends Identificable{

	@Column(length=4)
	 @DefaultValueCalculator(CurrentYearCalculator.class) 
	 int anyo;
	
	@ManyToOne(  
			fetch=FetchType.LAZY,  
			optional=true)  
			@DescriptionsList  
			CiudadOrigen ciudadOrigen; 
	
	
	@ManyToOne(  
			fetch=FetchType.LAZY,  
			optional=true)  
			@DescriptionsList  
			CiudadDestino ciudadDestino; 
	
	
	@Required
	@DefaultValueCalculator(CurrentLocalDateCalculator.class) 
	LocalDate fecha;
	
 
	@StringTime
    @Column(length=33)
	@DefaultValueCalculator(CurrentTimestampCalculator.class) 
    private String startTime; 
}
