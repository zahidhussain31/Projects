package com.ifElse;

public class IfElseStatementRunner {

	public static void main(String[] args) {
		puzzle1();
		puzzle2();
		puzzle3();
	}
	public static void puzzle1() {
		int k = 15;
		
		if(k > 20) {
			System.out.println(1);
		}
		
		else if (k < 20) {
			System.out.println(2);
		}
		
		else if (k > 10) {
			System.out.println(3);
		}
		
		else {
			System.out.println(4);
		}
	}
	public static void puzzle2() {
		int k = 35;
		
		if(k < 25) {
			System.out.println(5);
		}
		
		else if (k > 25) {
			System.out.println(6);
		}
		
		else {
			System.out.println(7);
		}
	}
	
	public static void puzzle3() {
		int l = 15;
		
		if (l < 20) {
			System.out.println("l<20");
		}
		
		if (l > 20) {
			System.out.println("l>20");
		}
		
		else {
			System.out.println("who am I");
		}
	}
}
