package org.example.java8.interfaceandmethods;

public interface Shape {

	//default and static methods in java 8 interface..
	default float area() {
		
		return 100.0f;
	}
	static String getColor() {
		
		return "Red";
	}
	
	//below will not work
	
	/*default boolean equals(Object obj) {
		return true;
	}*/
}
