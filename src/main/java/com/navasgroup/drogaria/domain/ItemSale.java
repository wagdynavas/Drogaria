package com.navasgroup.drogaria.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class ItemSale extends GenericDoMain {

	@Column(nullable = false)
	private Short quantity;

	@Column(nullable = false, precision = 7, scale = 2)
	private BigDecimal parcialValue;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Product product;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Sale Sale; //sergio colocou esse atributo como funcionario, vou esoerar para ver oq estácerto.
	
	
	
									// GETTERS AND SETTERS

	public Short getQuantity() {
		return quantity;
	}

	public void setQuantity(Short quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getParcialValue() {
		return parcialValue;
	}

	public void setParcialValue(BigDecimal parcialValue) {
		this.parcialValue = parcialValue;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Sale getSale() {
		return Sale;
	}

	public void setSale(Sale sale) {
		Sale = sale;
	}

}
