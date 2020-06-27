package com.BigDecimal;

import java.math.BigDecimal;

public class SimpleInterest {
	BigDecimal principal;
	BigDecimal interest;
	public SimpleInterest(String principal, String interest) {
		super();
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest);
	}
	public BigDecimal getPrincipal() {
		return principal;
	}
	public void setPrincipal(BigDecimal principal) {
		this.principal = principal;
	}
	public BigDecimal getInterest() {
		return interest;
	}
	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}
	public BigDecimal calculateTotalValue(int noOfYears) {
		BigDecimal totalValue = principal.add(principal.multiply(interest).multiply(new BigDecimal(noOfYears)));
		return totalValue;
	}
	

}
