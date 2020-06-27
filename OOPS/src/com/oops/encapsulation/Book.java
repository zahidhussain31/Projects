package com.oops.encapsulation;

public class Book {
	private int noOfCopies;
	void setnoOfCopies(int noOfCopies) {
		if(noOfCopies > 0)
		this.noOfCopies = noOfCopies;
	}
	void incNoOfCopies(int howMuch) {
		setnoOfCopies(this.noOfCopies + howMuch);
	}
	void decNoOfCopies(int howMuch) {
		setnoOfCopies(this.noOfCopies - howMuch);
	}
	
	public int getNoOfCopies() {
		return noOfCopies;
	}
	
	void open() {
		System.out.println("book opened");
	}
}
