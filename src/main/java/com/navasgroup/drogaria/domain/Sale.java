package com.navasgroup.drogaria.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class Sale extends GenericDoMain {
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date hour;

	@Column(nullable = false, precision = 7, scale = 2)
	private BigDecimal totalValue;

	@ManyToOne
	private Client client;//Partimos do principio de q se nao há cliente na venda, essa venda é a vista

	@ManyToOne
	@JoinColumn(nullable = false)
	private Employee employee;
	
							//GETTERS AND SETTERS

	public Date getHour() {
		return hour;
	}

	public void setHour(Date hour) {
		this.hour = hour;
	}

	public BigDecimal getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(BigDecimal totalValue) {
		this.totalValue = totalValue;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
