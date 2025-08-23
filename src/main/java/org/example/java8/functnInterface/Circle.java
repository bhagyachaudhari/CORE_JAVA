package org.example.java8.functnInterface;

public class Circle implements Shape {

	@Override
	public void getData() {
		System.out.println("Name: Circle");
		System.out.println("Color: Black");
	}
	
	public static void main(String args[]) {
		Circle c = new Circle();
		c.getData();
	}
}
