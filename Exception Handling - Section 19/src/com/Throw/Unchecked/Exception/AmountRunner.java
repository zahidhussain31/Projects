package com.Throw.Unchecked.Exception;

public class AmountRunner {

	public static void main(String[] args) {
		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("EUR", 20);
		
		int amount = amount1.add(amount2);
		System.out.println("USD " + amount);
	}

}
