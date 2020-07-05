package com.Arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Student {
	private String name;
	private int[] marks;
	public Student(String name, int... marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
	public int getNumberOfMarks() {
		return marks.length;
	}
	public int getTotalSumOfMarks() {
		int sum = 0;
		for(int mark : marks) {
			sum = sum + mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		int maximum = Integer.MIN_VALUE;
		for(int mark : marks) {
			if (mark > maximum) {
				maximum = mark;
			}
		}
		return maximum;
	}

	public int getMinimumMark() {
		int minimum = Integer.MAX_VALUE;
		for(int mark : marks) {
			if (mark < minimum) {
				minimum = mark;
			}
		}
		return minimum;
	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();
		
		BigDecimal avg = new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.HALF_UP);
		
		return avg;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + Arrays.toString(marks) + "]";
	}
	
	
}
