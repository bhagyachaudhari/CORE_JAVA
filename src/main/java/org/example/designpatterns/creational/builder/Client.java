package org.example.designpatterns.creational.builder;

public class Client {
    public static void main(String[] args) throws Exception {
        Student student = Student.getBuilder()
                .setName("bhagyac")
                .setAge(32)
                .setPsp(87)
                .setGradYear(2015)
                .setPhnNo(7777777777L)
                .setUnivName("Mumbai University").build();

        System.out.println(student.name);

    }

}
