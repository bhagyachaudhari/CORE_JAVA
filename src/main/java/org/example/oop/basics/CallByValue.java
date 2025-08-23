package org.example.oop.basics;

public class CallByValue {

	int data = 100;
	
	public void getData(int data) {
		data = data+50;
		System.out.println("Local value = "+data);
	}
	public static void main(String[] args) {
		CallByValue cbv = new CallByValue();
		System.out.println("Before Calling :: data = "+cbv.data);
		cbv.getData(40);
		System.out.println("After Calling :: data = "+cbv.data);
	}

}
