package com.oops2.composition;

import java.util.ArrayList;

public class Book {
	private int id;
	private String bookName;
	private String Name;
	private ArrayList<Review> reviews = new ArrayList<>();
	
	public Book(int id, String bookName, String name) {
		super();
		this.id = id;
		this.bookName = bookName;
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

	public void addReview(Review review) {
		this.reviews.add(review);
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", Name=" + Name + ", reviews=" + reviews + "]";
	}
	
	
	
	
}
