package com.WhileLoop;

public class WhileLoop {
	private int limit;

	public WhileLoop(int limit) {
		super();
		this.limit = limit;
	}

	public void printSquaresUptoLimit() {
		int i = 1;
		while(i * i < limit) {
			System.out.print(i * i + " ");
			i++;
		}
		System.out.println();
	}

	public void printCubesUptoLimit() {
		int i = 1;
		while(i * i * i < limit) {
			System.out.print(i * i * i + " ");
			i++;
		}
		System.out.println();
	}
	

}
