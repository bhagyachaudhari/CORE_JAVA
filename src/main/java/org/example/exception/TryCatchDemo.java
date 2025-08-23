package org.example.exception;

public class TryCatchDemo {

	public static void operation(int total) {
		int value = 0;
		try {
			value = 30 / total;
			// Code that might throw an exception
		}catch(Exception e) {
			System.out.println("Error: "+e);
		}
		System.out.println("Value: "+value);
	}
	public static void main(String[] args) {
		operation(0);
		
		String str = "Java"; // does not creates new instance
		String s = new String("Welcome"); //creates two objects and one reference variable
		
		 String s1 = "Raj";
		 s1.concat(" D");//concat() method appends the string at the end
		 System.out.println(s1);//will print Raj because strings are immutable objects
		   
	}

}







