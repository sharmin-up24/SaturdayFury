package com.upskill.java_1;

public class Variables {	
	//Variables in Java	
	//Instance OR global variable - Variables declared in Class level, outside method
	//Static variable - variables belong to class and don't required creating object
	//Local variable - variables declared in methods 
	//Method parameter - variables used as method parameter
	
	//Method Parameter = variables use as  method parameter
	
	public String country = "USA";					//Instance OR global variable - Variables declared in Class level, outside method
	public static String region = "America";		//Static variable - variables belong to class and don't required creating object
			
	public void ny(String county) {		
		//Local variable - variables declared in methods 
		//Local variable - variables declared in methods 
		
		String city = "NYC";
		
		System.out.println(country);
		System.out.println("---NY Method----");
		System.out.println(city);
		System.out.println(county);
	}
	public void nj(String county){
		
		String city = "Paterson";					//Local variable - variables declared in methods 
		
		System.out.println(country);
		System.out.println("---NJ Method----");
		System.out.println(city);
		System.out.println(county);
	}
	public static void main(String[] args) {
		
		Variables objName = new Variables();	//ClassName objName = new ClassName();
		objName.ny("Queens");
		objName.nj("Essex");
		
		System.out.println("---Static/NonStatic----");
		System.out.println(objName.country);
		System.out.println(region);
}
}
