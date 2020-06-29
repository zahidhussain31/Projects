package com.oops2.composition2;

public class Customer {
	private String name;
	private Address hmadd;
	private Address wrkadd;
	public Customer(String name, Address hmadd, Address wrkadd) {
		super();
		this.name = name;
		this.hmadd = hmadd;
		this.wrkadd = wrkadd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getHmadd() {
		return hmadd;
	}
	public void setHmadd(Address hmadd) {
		this.hmadd = hmadd;
	}
	public Address getWrkadd() {
		return wrkadd;
	}
	public void setWrkadd(Address wrkadd) {
		this.wrkadd = wrkadd;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", hmadd=" + hmadd + ", wrkadd=" + wrkadd + "]";
	}
	
	
	
}
