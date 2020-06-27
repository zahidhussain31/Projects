package com.DesigningAMenu;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("enter number1: ");
		int number1 = scanner.nextInt();
		System.out.println("The Number you have Enetred is - " + number1);
		
		System.out.print("enter number2: ");
		int number2 = scanner.nextInt();
		System.out.println("The Number you have Enetred is - " + number2);
		
		System.out.print("enter number3: ");
		int number3 = scanner.nextInt();
		System.out.println("The Number you have Enetred is - " + number3);
		
		System.out.println("choices available are ");
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");
		
		System.out.print("Enter Choice: ");
		int choice = scanner.nextInt();
		System.out.println("the choice you have entered is " + choice);
		
		nestedIfElse(number1, number2, number3, choice);
	}
	
	private static void nestedIfElse(int number1, int number2, int number3, int choice) {
		if(choice == 1) {
			System.out.println("sum = " +(number1 + number2 + number3));
		}
		else if(choice == 2) {
			System.out.println("difference = " +(number1 - number2 - number3));
		}
		else if(choice == 3) {
			System.out.println("division = "+(number1/number2/number3));
		}
		else if(choice == 4) {
			System.out.println("product = "+(number1 * number2 * number3));
		}
		else {
			System.out.println("please select from the options");
		}
	}
}
