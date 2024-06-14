package org.example.designpatterns.creational.prototyperegistry;

public class Student implements Prototype<Student>{

    String name;
    double psp;

    public  Student(){

    }

    public Student(Student other){
        this.name = other.name;
        this.psp = other.psp;
    }

    @Override
    public Student copy() {
        return new Student(this);
    }
}
