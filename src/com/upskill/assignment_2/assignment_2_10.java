package com.upskill.assignment_2;

import java.util.Scanner;

public class assignment_2_10 {

	public static void main(String[] args) {
//	10. Write a Java program to convert temperature from Fahrenheit to Celsius degree. {

		tempConvert();
	}

	public static void tempConvert() {
		Scanner input = new Scanner (System.in);
		Double farn, cels;
		System.out.println(" Enter the temperature in farenheit -");
		farn = input.nextDouble();
		cels = (farn - 32)* 5/9;
		System.out.println(" Converted temp will be " + cels );
	}
}
