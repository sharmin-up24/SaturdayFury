package com.upskill.assignment_1;

public class Assignment_1_3 {

	/*
	 * Problem 03:  Write a function which returns the value of multiplication  of 'a' and 'b' where a =
	 * 9 and b = 11. Write a program which will display addition of a + b + result of multiplication function.
	 */
	
	
	
	
	public static int function () {
		
		int a = 9;
		int b = 11;
		int c = a*b;
		
		return c;
	}


public static void main (String[]args) {
	
	function();
	
	int a = 9;
	int b = 11;
	int c = function();
	
	System.out.println(a+b+c);
	
}

}