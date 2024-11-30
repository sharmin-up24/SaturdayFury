package com.upskill.assignment_1;

public class Assignment_1_4 {
	
	/*
	 * A function returns 30, another function returns 50. Write a java program
	 * which will display subtraction value from bigger number to smaller.
	 */
	
	public static int method1() {
		
		return 30;
	}
	public static int method2() {
		
		return 50;
	}
	
	
	public static void main(String[] args) {
		
		method1();
		method2();
		int a = method1(); 
		int b = method2();
		
		System.out.println(b-a);

	}

}
