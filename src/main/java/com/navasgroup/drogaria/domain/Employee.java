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
public class Employee extends GenericDoMain {

	@Column(length = 10, nullable = false)
	private String WorkLetter;

	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dateOfAdimission;

	@OneToOne
	@JoinColumn(nullable = false)
	private Person person;
	
						//GET AND SET
	public String getWorkLetter() {
		return WorkLetter;
	}

	public void setWorkLetter(String workLetter) {
		WorkLetter = workLetter;
	}

	public Date getDateOfAdimission() {
		return dateOfAdimission;
	}

	public void setDateOfAdimission(Date dateOfAdimission) {
		this.dateOfAdimission = dateOfAdimission;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
