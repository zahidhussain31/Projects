package com.Throw.Unchecked.Exception;

public class Amount {
	private String currency;
	private int amount;
	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	
	public int add(Amount that) {
		if(!this.currency.equals(that.currency)) {
			throw new RuntimeException ("Currencies do not match ");
		}
		
		return this.amount = this.amount + that.amount;
	}
	
	public String toString() {
		return amount + " " + currency;
	}
}
