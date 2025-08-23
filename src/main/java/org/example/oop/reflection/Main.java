package org.example.oop.reflection;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person p = new Person();
        System.out.println(p.getName());  // Access via getter

        // using reflection to access private field

        Person p1 = new Person();
        Field field = Person.class.getDeclaredField("name");
        field.setAccessible(true);
        System.out.println(field.get(p1));  // Output: John
    }
}
