package com.navasgroup.drogaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class State extends GenericDoMain {
	@Column(length = 2, nullable = false)// edita o tamanho do campo e desabilita a possibilidade da variavel ser nula.
	private String initials;
	
	@Column(length = 50, nullable = false)
	private String name;

	// GETTERS AND SETTERS
	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "State [initials=" + initials + ", name=" + name + "]";
	}
	
	

}
