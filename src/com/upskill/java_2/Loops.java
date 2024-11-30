package com.upskill.java_2;

public class Loops {

	public static void main(String[] args) {
		practiceForLoop();
		practiceWhileLoop();
		practiceDoWhileLoop();
		//practiceInfiniteLoop();
		practiceNestedForLoop();
		
	}
//		/*Type of Loops 
//		 * 1. For Loop
//		 * 2.While Loop
//		 * 2.Do While Loop
		//Infinite Loop
		
		public static void practiceForLoop() {					//For Loop - Do again and again upto upper limit
		int i;													//Initialize the variable
		for(i=10; i>=1; i--) {									//Setting lower limit, upper limit, Increment or Decrement
			System.out.println("For Loops number = " + i);		//Statement
		}
		}
		public static void practiceWhileLoop() {					// While Loop - Do again and again upto condition match
			int i = 1;												//Initialize the variable
			while( i<=10) {											//Setting Condition
				System.out.println("While Loops number = " + i);	//Statement
				i++;												//Increment or decrement
			}
			}
		public static void practiceDoWhileLoop() {						// Do While Loop - Do action then match condition 
			int i = 1;													//Initialize the variable
			do {											
				System.out.println("DoWhile Loops number = " + i);		//Statement
				i++;													//Increment or decrement
				}while(i<10);											//Checking condition
			}
		public static void practiceInfiniteLoop() {						// Infinite Loop - never ending loop
			int i;														//Initialize the variable
			for( i=1; ; i++) {											//Setting lower limit, No upper limit
				System.out.println("Infinite Loops number = " + i);		//Statement
				i++;													//Increment or decrement
			}
		}
			public static void practiceNestedForLoop() {				// Nested Loop - 
				int i;												//Initialize the variable
				int j;												//Initialize the variable
				for( i=1; i<=10; i++) {											//Setting Condition
					for( j=1; j<=10; j++) {											//Setting Condition
						int multiplicationTable =i *j;
					System.out.print(multiplicationTable + " \t ");	//Statement			
	}
					System.out.println(" ");
}
			}
}


