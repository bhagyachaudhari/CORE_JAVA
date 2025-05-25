package org.session.Polymorphism;

import Polymorphism.User;

public class Student extends User {
    double psp;

    public void joinClass(){
        System.out.println("Student");
    }
}
