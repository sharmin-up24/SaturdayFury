package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType{
	
	/* Polymorphism is the ability of an object to take on many forms.
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/
	public static void main(String[] args) {
		
		car();
		car(5);
		car("Black");
		car(true);
		car(4,"Dual");
		
		Polymorphism obj = new Polymorphism();
		obj.annualIncomeVoid();
		//System.out.println("My Annual Income = + calculateAnnualIncome");
		
	}
	
	public void annualIncomeVoid() {
		int calculateAnnualIncome = hourlyIncome * 2000;
		int rentalIncome = 30000;
		int bonus = 20000;
		int sideHussel = 25000;
		int newIncome =	(calculateAnnualIncome + rentalIncome + bonus + sideHussel);
		System.out.println("My Annual Income = " + newIncome);
		
	}
	//- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload

	public static void car() {
		System.out.println("My car is Tesla");
	}
	
	public static void car( int seat) {
		System.out.println("My car is Tesla"+ "it has seat :" + seat);
	}
	public static void car( String color) {
		System.out.println("My car is Tesla" + " it has color : " + color );
	}
	public static void car(boolean selfdriver) {
		System.out.println("My car is Tesla" + " it is self driven" );
	}
	public static void car( int door, String motor) {
		System.out.println("My car is Tesla"+ "it has door :" + door + "it has motor : " + motor );

		//- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
}
}
