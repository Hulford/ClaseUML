package com.tuempresa.claseuml.modelo;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Ciudad {

	@Column ( length = 32)
	String Ciudad;
}
