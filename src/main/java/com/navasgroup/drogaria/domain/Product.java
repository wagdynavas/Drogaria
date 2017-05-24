package com.navasgroup.drogaria.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Product extends GenericDoMain {
	
	@Column(length = 100, nullable = false)
	private String description;
	
	@Column(nullable = false)
	private Short quantity;
	
	//precision indica a quantidade de numeros que iram ser representados. EX 1700,00
	//Coloquei apenas 6 pq nao acredito que em uma farmacia exista um produto de 10.000,00 ou maior
	//Scale indica a quantidade de numeros depois da virgula.
	@Column(nullable = false, precision = 6, scale = 2)
	private BigDecimal price;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Manufacturer manufacturer;
	
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Short getQuantity() {
		return quantity;
	}

	public void setQuantity(Short quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Product [Description=" + getDescription() + ", Quantity= " + getQuantity() +
				", Price= " + getPrice() + ", Manufacturer= " + getManufacturer() + "]";
	}

	
	

}
