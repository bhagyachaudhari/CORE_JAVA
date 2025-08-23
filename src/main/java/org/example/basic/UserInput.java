package org.example.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) 
	{
		//using Console class
		System.out.println("Please Enter your Name : ");
		String name = System.console().readLine();
		System.out.println("Your String is = "+name);
		
		// using Buffered Reader class
		
		/*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Please Enter your Name : ");
			String name = reader.readLine();
			System.out.println("Your Name is : "+name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	
		// Using Scanner Class
		
		/*Scanner input = new Scanner(System.in);
		System.out.println("Please enter your Name: ");
		String name = input.nextLine();
		System.out.println("Your name is : "+name);
		
		System.out.println("Please enter your Age: ");
		int age = input.nextInt();
		System.out.println("Your Age is : "+age);
		
		System.out.println("Please enter your Salary: ");
		float salary = input.nextFloat();
		System.out.println("Your Salary is : "+salary);
		
		input.close();*/
	}

}
