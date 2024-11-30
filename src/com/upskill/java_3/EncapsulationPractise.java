package com.upskill.java_3;

public class EncapsulationPractise {
	
	private String student = "Raton";
	private int studentId = 11;

	public void setStudent(String student) {
		this.student=student;
	}
		
	public String getStudent() {
		return student;
	}
	
	public void setstudentId(int studentId) {
		this.studentId=studentId;
	}
	
	public int getstudentId() {
		return studentId;
	}
	
	public static void main (String[]args) {
		
		EncapsulationPractise Enc = new EncapsulationPractise();
		Enc.setStudent("Raton");
		System.out.println(Enc.getStudent());
		Enc.setstudentId(11);
		System.out.println(Enc.getstudentId());
		
	
	}
	

}
