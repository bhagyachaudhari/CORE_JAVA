package org.example.java8.functnInterface;

@FunctionalInterface
public interface Shape {

	//abstract void getColor();// not allowed
	void getData();
	//void getData1();// not allowed
	//static void getData();// not allowed
	//private static final void getData(); // not allowed
	default void getName() {
		System.out.println("this is default method 1..");
	}
	default void getName1() {
		System.out.println("this is default method 2..");
	}
	
	// It can contain any number of Object class methods.  
	String toString();
	int hashCode();
	boolean equals(Object obj);  
}
@FunctionalInterface
interface Test extends Shape{
	//void getData1(); // will throw error 
}
