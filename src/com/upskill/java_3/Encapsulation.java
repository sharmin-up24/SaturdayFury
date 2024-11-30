package com.upskill.java_3;

public class Encapsulation {


//		Encapsulation used to hide the data using setter and getter methods
	
	
		private String name = "upskill";
		private int ssn = 123456;
		private String username = "sharminjahan";
		
		
		
		
		// Setter Method - name
		public void setName(String value) {
			name = value;
		}
	
		// Getter Method - name
		public String getName() {
			return name;
		
	
	}
		// Setter Method - name
				public void setSSN(int value) {
					ssn = value;
					
					
					
					
		
					}
				
		
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		System.out.println(obj.getName());
		obj.setName("Sharmin");
		System.out.println(obj.getName());

	}
	
}
