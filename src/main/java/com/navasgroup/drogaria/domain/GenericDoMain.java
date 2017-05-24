package com.navasgroup.drogaria.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@SuppressWarnings("serial")
//Diz para o Hibernate que essa class nao corresponde a um tabela,mas q será usada por outros para gerar tabelas
//também utilizamos para trabalhar com heranca, caso vc nao queira que uma superclass nao seja uma tabela, apenas sua subclass
@MappedSuperclass 
public class GenericDoMain implements Serializable{
	@Id //chave primaria.
	@GeneratedValue(strategy = GenerationType.AUTO) // gera automaticamente a chave primaria.
	private Long code;

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	
	
}
