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
	
	@Required
	@DefaultValueCalculator(CurrentLocalDateCalculator.class) 
	LocalDate fecha;
}
