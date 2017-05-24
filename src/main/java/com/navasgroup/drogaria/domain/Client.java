package com.navasgroup.drogaria.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class Client extends GenericDoMain {
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)// falando de Date, vc pode escoler em armazenar Data, Hora ou os dois
	private Date dateRegister;
	
	@Column(nullable = false)
	private Boolean free;
	
	@OneToOne
	@JoinColumn(nullable = false)
	private Person person;
	

	public Date getDateRegister() {
		return dateRegister;
	}

	public void setDateRegister(Date dateRegister) {
		this.dateRegister = dateRegister;
	}

	public Boolean getFeer() {
		return free;
	}

	public void setFeer(Boolean feer) {
		this.free = feer;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
