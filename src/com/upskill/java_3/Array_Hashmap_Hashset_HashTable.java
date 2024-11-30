package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		int age = 29;
		int []ageFury = new int[] {25, 29, 32, 39, 49};
		// Array Index			  [0]  [1] [2] [3] [4]
		
		System.out.println("Student Age : " + ageFury[3]);
		System.out.println("Total Length : " + ageFury.length);
		
		String[]nameFury = new String[] {"Raton", "Zia", "Syed", "Sharmin"};

		System.out.println("Student name : " + nameFury[2]);
		System.out.println("Total Student : " + nameFury.length);
	
	//Multi_Dimensional Array
		int[][] ageFury2D = {{29, 32, 47, 58, 62},
							{29, 39, 49}};
		
		System.out.println("Student Age 2D: " + ageFury2D[1][1]);
		
		String[][]nameFury2D = new String[][]{{"Raton", "Zia", "Syed", "Sharmin"},
		{"Fahmida", "Rafida", "Rozony", "Pavel"}};
		System.out.println("Student Name 2D: " + nameFury2D[1][1]);
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Raton", 29);
		Student.put("Zia", 32);
		Student.put("Syed", 47);
		
		System.out.println("HashMap Student Age : "+ Student.get("Syed") );
		
		HashMap<String, String> Capital = new HashMap<String, String>();
		Capital.put("USA", "WashingtonDC");
		Capital.put("Bangladesh", "Dhaka");
		Capital.put("Japan", "Tokyo");
		
		System.out.println("HashMap Capital  : "+ Capital.get("USA") );

		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		
		Region.put("China", "Asia");
		Region.put("Egypt", "Africa");
		
		System.out.println("Region : " + Region);
		

		HashSet<String> Car = new HashSet<String>();
		
		Car.add("BMW");
		Car.add("Toyota");
		Car.add("Audi");
		Car.add("Ford");
		
		System.out.println("Car : " + Car);
		
		
		}
	
	
	}


