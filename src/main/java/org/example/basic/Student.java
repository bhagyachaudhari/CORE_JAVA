package org.example.basic;

public class Student {

    int id;
    String name;
    public Student(){
        System.out.println("Constructor called..");
    }

    public static void swap(Student s){
        s.id = 202;
        s.name = "Chaudhari";
    }

    public static void swap2(Student s1, Student s2){
        Student temp = s1;
        s1 = s2;
        s2 = temp;
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.id = 101;
        s.name = "Bhagyac";
        System.out.println("Before swapping");
        System.out.println(s.id);
        swap(s);
        System.out.println("After swapping");
        System.out.println(s.id);

        Student s1 = new Student();
        s1.id = 500;
        s1.name = "Raj";

        System.out.println("Before swapping");
        System.out.println(s.id);
        swap2(s, s1);
        System.out.println("After swapping");
        System.out.println(s.id);

    }
}
