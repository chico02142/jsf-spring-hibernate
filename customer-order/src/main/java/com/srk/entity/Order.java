package com.srk.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.srk.entity.embeddable.Amount;

/**
 * Order Entity
 * @author Seetharama Krishna
 *
 */
@Entity
@Table(name = "ORDER")
public class Order extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5371229184479854011L;
	
	@Column(name = "NAME", length = 50)
	private String name;
	
	@Column(name = "ORDER_DESCRIPTION", length = 255)
	private String description;
	
	@Embedded
	private Amount value;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "CUSTOMER_ID")
	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Amount getValue() {
		return value;
	}

	public void setValue(Amount value) {
		this.value = value;
	}

}
