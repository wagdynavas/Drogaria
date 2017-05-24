package com.navasgroup.drogaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Manufacturer extends GenericDoMain{
	
	@Column(length = 50, nullable = false)
	private String description;

	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Manufacturer [description=" + description + "]";
	}
	
	
}
