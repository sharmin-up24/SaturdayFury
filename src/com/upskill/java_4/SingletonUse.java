package com.upskill.java_4;

public class SingletonUse {

	public static void main(String[] args) {

	//	Singleton obj = new Singleton();
		Singleton obj = Singleton.getInstance();
		
		obj.demo();
		obj.fury();
		obj.loki();
	}

}
