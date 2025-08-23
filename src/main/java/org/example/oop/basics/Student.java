package org.example.oop.basics;

//create a class
public class Student {

	//define variables
	int rollNo;
	String name;
	static String collegeName = "VJTI";
	
	//define method
	public void getStudentDetails()
	{
		System.out.println("Roll No = "+rollNo);
		System.out.println("Name = "+name);
		System.out.println("College Name = "+collegeName);
	}
	
	//Java main method
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.rollNo = 101;
		s1.name = "Raj";
		s1.getStudentDetails();
		
		System.out.println();
		
		Student s2 = new Student();
		s2.rollNo = 102;
		s2.name = "Bhagya";
		s2.getStudentDetails();
	}

}
