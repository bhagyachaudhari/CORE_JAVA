package org.example.oop.objectmethods;

import java.lang.reflect.InvocationTargetException;

/**
 * create objects
 */
public class Client {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        // create an object of the class
        Student s1 = new Student();
        // access the data members
        s1.name = "John";
        s1.age = 20;

        // print the values
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);

        Product obj = (Product) Class.forName("oops.objectmethods.Product").newInstance();
        obj.name = "Laptop";
        System.out.println("Product Name: " + obj.name);

        Product obj1 = Product.class.getDeclaredConstructor().newInstance();
        obj1.name = "Mobile";
        System.out.println("Product Name: " + obj1.name);
    }
}
