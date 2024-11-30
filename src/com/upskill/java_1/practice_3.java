package com.upskill.java_1;

public class practice_3 {



	public String country = "USA";
	public static String region = "North America";

		public static void main(String[] args) {
		String city = "New York";// Local variable
		String PD = "NYPD";
		
		System.out.println(city);
		System.out.println(PD);
		
		practice_3 variable = new practice_3();
		
		System.out.println(variable.country);
		System.out.println(region);
		World("Earth");
	
	}

	public static void World(String name)  { 
		System.out.println(name);
}
	public static void Person()  { 
		String namee ="rashid";
		System.out.println(namee);
		System.out.println(region);
		practice_3 obj = new practice_3();
		
		System.out.println(obj.country);

	}


	}


