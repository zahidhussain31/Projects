package com.DoWhile;

import java.util.Scanner;

public class DoWhileRunner {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int number = -1;
		do{
			if(number != -1) {
				System.out.println("Cube is " + (number*number*number));
			}
			
			System.out.print("Enter a Number: ");
			number = scanner.nextInt();
		}while(number >= 0);
		System.out.println("Thank you Have Fun");
	}

}
