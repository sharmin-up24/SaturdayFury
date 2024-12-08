package com.upskill.java_4;

public class Singleton {
	
	// Singleton is class that can have only one object
	
	// Private constructor, it prevents any other class from instantiating
	
	private Singleton() {
		
	}
	private static Singleton SingletonObj = new Singleton();
	
	protected void demo() {
		System.out.println("Demo method for singleton class");
	}
	protected void fury() {
		System.out.println("Demo method for fury class");
	}
	protected void loki() {
		System.out.println("Demo method for loki class");
	}
	public static Singleton getInstance() {		// getter method(read only)
		return SingletonObj;
		
	}
}
