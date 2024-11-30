package com.upskill.java_1;

public class MethodType {
	
	/*Types of Methods
	 * 1.Void Method
	 * 2.Static Method
	 * 3.Return Method
	 */
//test git	
	public static int hourlyIncome =68;

	public static void main(String[]args) {
		MethodType obj = new MethodType();
		obj.annualIncomeVoid();
		//monthlyIncomeReturn();
		weeklyIncomeStatic();
	}	
	//Void Method
	public void annualIncomeVoid() {
		int calculateAnnualIncome= hourlyIncome * 2000;
		System.out.println("My Annual Income = " + calculateAnnualIncome);
	}
	//Return  Type Method
		public int monthlyIncomeReturn() {
			int calculatemonthlyIncome= hourlyIncome * 180;
			System.out.println("My monthlyIncome = " + calculatemonthlyIncome);
			return calculatemonthlyIncome;
		}
			public String name() {
			String myName= "Sharmin";
			return myName;
		}
		
		public boolean isitraining() {
			return false;
		}
			//Static Method
		public static void weeklyIncomeStatic() {
		int calculateweeklyIncome= hourlyIncome * 40;
		System.out.println("My  weekly Income = " + calculateweeklyIncome);
		
		}
}

