package com.Array.List.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class StudentCollectionRunner {

	public static void main(String[] args) {
		
		/*Creating a new Array List from the fields assigned in Class Student
		 * Creating new elements in the class 
		 * Adding the new elements to the Array List
		 */
		List<Student> students = new ArrayList<>();
		
		Student s1 = new Student(101, "Zahid");
		Student s2 = new Student(108, "Aamir");
		Student s3 = new Student(104, "Amzar");
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		System.out.println(students);
		Collections.sort(students);
		System.out.println(students);
		
	}

}
