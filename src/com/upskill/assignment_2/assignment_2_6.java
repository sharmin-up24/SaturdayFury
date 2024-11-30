package com.upskill.assignment_2;

public class assignment_2_6 {
	
//	6. Write a java program to find the prime number from 1 to 100 and print them.

	public static void main(String[] args) {
		 {
		        System.out.println("Prime numbers from 1 to 100 are:");
		        System.out.println();
		        for (int number = 2; number <= 100; number++) {
		            boolean isPrime = true;
		            
		            for (int i = 2; i <= Math.sqrt(number); i++) {
		            	if (number % i ==0) {
		            		isPrime = false;
		            		break;
		            	}
		            }
		         if (isPrime) {
		        	
		        	 System.out.print(number + " ");
		         }
		  }

		        
}
}
}