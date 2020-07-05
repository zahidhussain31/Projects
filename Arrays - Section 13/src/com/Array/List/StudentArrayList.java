package com.Array.List;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;



public class StudentArrayList {
	private String name;
	private ArrayList<Integer> marks = new ArrayList<>();
	
	
	
	public StudentArrayList(String name, int... marks) {
		super();
		this.name = name;
		for(int mark : marks) {
			this.marks.add(mark);
		}
	}
	public int getNumberOfMarks() {
		return marks.size();
	}
	public int getTotalSumOfMarks() {
		int sum = 0;
		for(int mark : marks) {
			sum = sum + mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		return Collections.max(marks);
	}

	public int getMinimumMark() {
		return Collections.min(marks);
	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();
		
		BigDecimal avg = new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.HALF_UP);
		
		return avg;
	}
	@Override
	public String toString() {
		return name + marks;
	}
	public void addNewMark(int mark) {
		marks.add(mark);
	}
	public void removeAtIndex(int index) {
		marks.remove(index);
	}
	

}
