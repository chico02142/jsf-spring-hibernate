package com.srk.entity.embeddable;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * <p>
 *		Amount data, embeddable in the entities for the amount information.
 * </p>
 * @author Seetharama Krishna
 *
 */
@Embeddable
public class Amount {
	
	@Column(name = "AMOUNT", length = 21, precision = 2)
	private BigDecimal amount;
	
	@Column(name = "CURRENCY", length = 3)
	private String currencyCode;
	
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	
	

}
