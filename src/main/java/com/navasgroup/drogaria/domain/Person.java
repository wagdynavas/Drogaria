package com.navasgroup.drogaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Person extends GenericDoMain{
	/*
	 * Na minha opniao podemos criar uma class Addrees, entao Person teria um
	 * Address mas como estou aprendendo vou fazer igual o professor. Mudarei
	 * isso no futuro.
	 */
	@Column(length = 50, nullable = false)
	private String name;
	
	@Column(length = 12, nullable  = false)
	private String passportNumber;
	
	@Column(length = 12, nullable  = false)
	private String idNumber;
	
	@Column(length = 100, nullable  = false)
	private String street;
	
	@Column(nullable = false)
	private Short number;
	
	@Column(length = 30, nullable  = false)
	private String region;
	
	@Column(length = 10, nullable  = false)
	private String postCode;
	
	@Column(length = 13)
	private String complement;
	
	@Column(length = 14)
	private String phone;
	
	@Column(length = 12, nullable  = false)
	private String cellPhone;
	
	@Column(length = 30)
	private String email;
	
	@ManyToOne
	@JoinColumn( nullable  = false)
	private City city;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getRg() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Short getNumber() {
		return number;
	}

	public void setNumber(Short number) {
		this.number = number;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return " [name=" + name + ", passportNumber=" + passportNumber + ", idNumber=" + idNumber + ", street="
				+ street + ", number=" + number + ", region=" + region + ", postCode=" + postCode + ", complement="
				+ complement + ", phone=" + phone + ", cellPhone=" + cellPhone + ", email=" + email + ", city=" + city
				+ "]";
	}
	
	
	

}
