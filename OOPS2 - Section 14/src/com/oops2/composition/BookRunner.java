package com.oops2.composition;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(123, "The Client", "Zahid");
		book.addReview(new Review(10, "Great Book", 5));
		book.addReview(new Review(101, "lol", 1));
		
		System.out.println(book);
	}

}
