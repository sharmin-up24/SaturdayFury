package com.upskill.java_5;

//Abstract Class to Class: A child class inherits (extends) an abstract class 
//and must implement its abstract methods (if not already implemented in an intermediary class).

//Abstract Class to Abstract Class: One abstract class can inherit (extend) 
//another abstract class. The child abstract class can choose to implement the parent’s abstract methods or leave them abstract for further subclasses to implement.

public abstract class AbstractClass {
	
	
		public abstract void icar();
	
		public abstract void iwheel();
		
		public abstract void idoor();
		
		public abstract void iengine();
		
		public abstract String iname();
		public String name() {
			String name = "UpSkill";
			return name;
		}
		public int age() {
			int age = 49;
			return age;
		}
		public boolean ev() {
			boolean  ev = true;
			return ev;
		}
		public void car() {
			System.out.println("My car is Tesla");

	}

		public void bus() {
			System.out.println("My bus is a Volvo");
		}
}
//