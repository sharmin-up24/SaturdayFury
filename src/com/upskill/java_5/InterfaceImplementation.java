package com.upskill.java_5;

public class InterfaceImplementation implements Interface {

	@Override
	public void icar() {
		System.out.println("My car is BMW");
	}

	@Override
	public void iwheel() {
		System.out.println("My car has 4 wheels");		
	}

	@Override
	public void idoor() {
		System.out.println("My car has 5 doors");		
	}

	@Override
	public void iengine() {
		System.out.println("My car has Motors");		
	}

	@Override
	public String iname() {
		String name = "UpSkill";
		return name;
	}

	@Override
	public int iage() {
		int age = 49;
		return age;
	}

	@Override
	public boolean iev() {
		boolean  ev = true;
		return ev;
	}

}
