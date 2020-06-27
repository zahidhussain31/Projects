package com.BigDecimal;

import java.math.BigDecimal;

public class SimpleInterestRunner {

	public static void main(String[] args) {
		SimpleInterest calculator = new SimpleInterest("7500.00", "12.5");
		BigDecimal totalValue = calculator.calculateTotalValue(5);
		System.out.println(totalValue);
	}

}
