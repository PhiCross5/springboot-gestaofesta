package com.algaworks.festa.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Convidado implements Serializable{

	private static final long SerialVersionUID=1L;
	
	@Id
	@GeneratedValue
	private Long Id;
	
	private String nome;
	
	private Integer quantidadeAcompanhantes;
}
