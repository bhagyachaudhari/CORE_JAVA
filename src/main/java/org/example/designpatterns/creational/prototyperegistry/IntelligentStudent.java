package org.example.designpatterns.creational.prototyperegistry;

public class IntelligentStudent extends Student{
    int iq;

    public IntelligentStudent(){

    }

    public IntelligentStudent(IntelligentStudent other) {
        super(other);
        this.iq = other.iq;
    }

    public IntelligentStudent copy() {
        return new IntelligentStudent(this);
    }
}
