package org.example.java8.interfaceandmethods;

public class Rectangle implements Shape {

	public static void main(String args[]) {
		Shape s = new Rectangle();
		System.out.println(s.area());
		
		Rectangle r = new Rectangle();
		System.out.println(r.area());
		
		System.out.println(Shape.getColor());
	}
}
