package com.Arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		
		Student student = new Student("Zahid" , 97, 99, 100);
		System.out.println(student);

		int number = student.getNumberOfMarks();
		System.out.println("Number of marks : "+ number);
		
		int sum = student.getTotalSumOfMarks();
		System.out.println("Sum of marks : "+ sum);
		
		int maximum = student.getMaximumMark();
		System.out.println("Maximum of marks : "+ maximum);
		
		int minimum = student.getMinimumMark();
		System.out.println("Minimum of marks : "+ minimum);
		
		BigDecimal average = student.getAverageMarks();
		System.out.println("Average of marks : "+ average);

	}

}
