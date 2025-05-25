package org.session.Inheritance;

import Inheritance.Student;
import Inheritance.User;

public class Client {
    public static void main(String[] args) {
        Inheritance.User user = new User();
        Student student = new Student();
        student.login();
        student.setName("Mohit sharma");
        student.login();
        student.setPassword("sharma ji");
//        student.password = "sharma ji";
//        user.attendClass();
        System.out.println(student.getPassword());
    }
}

// User
    // name
    // login()
    // Student : Inheriting from the User
            // name
            // login()
// Client : Main