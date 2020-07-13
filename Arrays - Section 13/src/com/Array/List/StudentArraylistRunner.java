package com.Array.List;

import java.math.BigDecimal;

public class StudentArraylistRunner {

	public static void main(String[] args) {
		StudentArrayList studentAL = new StudentArrayList("Zahid" , 97, 99, 100);
		
		int number = studentAL.getNumberOfMarks();
		System.out.println("Number of marks : "+ number);
		
		int sum = studentAL.getTotalSumOfMarks();
		System.out.println("Sum of marks : "+ sum);
		
		int maximum = studentAL.getMaximumMark();
		System.out.println("Maximum of marks : "+ maximum);
		
		int minimum = studentAL.getMinimumMark();
		System.out.println("Minimum of marks : "+ minimum);
		
		BigDecimal average = studentAL.getAverageMarks();
		System.out.println("Average of marks : "+ average);
		
		System.out.println(studentAL);
		
		studentAL.addNewMark(50);
		System.out.println(studentAL);
		
		studentAL.removeAtIndex(2);
		System.out.println(studentAL);
		
	}

}
