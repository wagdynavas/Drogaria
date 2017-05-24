package com.navasgroup.drogaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@SuppressWarnings("serial")
@Entity
public class User extends GenericDoMain {

	@Column(length = 32, nullable = false) // Usaremos o padrao MD5 de
											// criptocrafia.
	private String password;

	@Column(nullable = false)
	private Character type;

	@Column(nullable = false)
	private Boolean active;

	@OneToOne
	@JoinColumn(nullable = false)
	private Person person;
	
								//GET AND SET

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Character getType() {
		return type;
	}

	public void setType(Character type) {
		this.type = type;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
