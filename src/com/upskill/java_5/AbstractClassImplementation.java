package com.upskill.java_5;


//	(Parent)					(Keyword)					(Child)							(Keyword)				(GrandChild)
//-----------------------------------------------------------------------------------------------------------------------------------------
//	Class(0)				 	extends						Class(0)
//	Abstract Class (A7)			extends						Class (A7-R7=0)
//	Interface (A7)				implements					Class (A7-R7=0)
//	Interface (A7)				extends						Interface (A7+A3=A10)			implements				Class (A10-R10=0)
//	Interface (A7)				implements					Abstract Class (A7-R7=0)
//	Abstract Class (A7)			extends						Interface (A7+A3=A10)			implements				Class (A10-R10=0)


public class AbstractClassImplementation extends AbstractClass {

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

}
