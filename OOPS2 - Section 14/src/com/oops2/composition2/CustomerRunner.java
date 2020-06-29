package com.oops2.composition2;

public class CustomerRunner {

	public static void main(String[] args) {
		Address hmadd = new Address("line1","Hyd", "500008");
		Customer customer = new Customer("ranga", hmadd, null);
		System.out.println(customer);
		
		Address wrkadd=new Address("lin wrk","Hyd", "500016");
		customer.setWrkadd(wrkadd);
		System.out.println(customer);
	}

}
