package com.upskill.assignment_2;

public class Assignment_2_2 {

	//2. A school conducts a 100 mark exam for its student and grades them as follows: 
	//   Grade: Grade A: Marks>=90 Grade B: Marks>=80-89 Grade C: Marks>=70-79 Grade D: Marks>=60-69 AND FAIL THEM WHO HAS <60

	//public static void main(String[] args) {


	    // Method to calculate and display grade
	    public static void calculateGrade(int marks) {
	        if (marks >= 90) {
	            System.out.println("Grade: A");
	        } else if (marks >= 80) {
	            System.out.println("Grade: B");
	        } else if (marks >= 70) {
	            System.out.println("Grade: C");
	        } else if (marks >= 60) {
	            System.out.println("Grade: D");
	        } else {
	            System.out.println("Grade: FAIL");
	        }
	    }
	    public static void main(String[] args) {
	        // Test cases to display each grade type
	        System.out.println("Student with 95 marks:");
	        calculateGrade(95); // Expected Grade: A

	        System.out.println("Student with 85 marks:");
	        calculateGrade(85); // Expected Grade: B

	        System.out.println("Student with 75 marks:");
	        calculateGrade(75); // Expected Grade: C

	        System.out.println("Student with 65 marks:");
	        calculateGrade(65); // Expected Grade: D

	        System.out.println("Student with 55 marks:");
	        calculateGrade(55); // Expected Grade: FAIL
	    }
	

	}


