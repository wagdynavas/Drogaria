package com.navasgroup.drogaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class City extends GenericDoMain{
	@Column(length = 50, nullable = false)
	private String name;
	
	@ManyToOne
	@JoinColumn(nullable = false)// usamos para editar colunas q sao chaves estrangeira
	private State state;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return " [name=" + name + ", state=" + state + "]";
	}
	
	
	
}
