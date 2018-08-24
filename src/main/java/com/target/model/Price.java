package com.target.model;

import java.math.BigDecimal;

/**
 * This Class is Helper for Price
 * @author Elham
 *
 */
public class Price {
	
	private BigDecimal value;
	private String currency_code;
	
	public Price() {
		
	}
	
	public Price(BigDecimal value, String currency_code) {
		super();
		this.value = value;
		this.currency_code = currency_code;
	}
	
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public String getCurrency_code() {
		return currency_code;
	}
	public void setCurrency_code(String currency_code) {
		this.currency_code = currency_code;
	}
	
	

}
