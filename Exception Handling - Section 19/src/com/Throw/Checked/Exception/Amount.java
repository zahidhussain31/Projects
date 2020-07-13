package com.Throw.Checked.Exception;

public class Amount {
	private String currency;
	private int amount;

	
	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public int add(Amount that) throws Exception {
		if(!this.currency.equals(that.currency)) {
			throw new Exception ("Currencies do not match " + this.currency + " & " + that.currency);
		}
		
		return this.amount = this.amount + that.amount;
	}
	
	public String toString() {
		return amount + " " + currency;
	}
}
