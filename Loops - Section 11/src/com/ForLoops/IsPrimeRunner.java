package com.ForLoops;

public class IsPrimeRunner {

	public static void main(String[] args) {
		IsPrime isPrime = new IsPrime(5);
		
		boolean prime = isPrime.prime();
		System.out.println(" " +prime);
		
		int sum = isPrime.sumUptoN();
		System.out.println(" " +sum);
	}

}
