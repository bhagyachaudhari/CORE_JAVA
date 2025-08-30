package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<? extends Number> list = new ArrayList<Integer>();
        //list.add(10); // Compile-time error

        print(123);   // Works
        print("abc"); // Works

        List<? super Integer> list1 = new ArrayList<Number>();
        list1.add(10);  // OK
        //list1.add(3.14); // Error

        new Example("Hello");
        new Example(123);

        List<Integer> list3 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        System.out.println(list3.getClass() == list2.getClass());
    }

    public static void add(List<?> list) {
         list.add(null); // Allowed
         //list.add("test");  // Error
    }

    public static <T> void print(T t) {
        System.out.println(t);
    }

    @SafeVarargs
    static <T> void print1(T... args) {
        for (T t : args) System.out.println(t);
    }
}

class Test<T> {
    //private static T value; // Error
}

class Example {
    <T> Example(T t) {
        System.out.println(t);
    }
}






