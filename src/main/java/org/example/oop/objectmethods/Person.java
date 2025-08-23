package org.example.oop.objectmethods;

public class Person implements Cloneable {
    private int age;
    protected double psp;
    String name; // default access modifier
    public int gradYear;

    public Person(int age, double psp, String name, int gradYear) {
        this.age = age;
        this.psp = psp;
        this.name = name;
        this.gradYear = gradYear;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", PSP: " + psp + ", Graduation Year: " + gradYear);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }

    public static void main(String[] args) {
        try {
            Person person1 = new Person(25, 85.5, "Alice", 2023);
            person1.display();

            // Cloning the person1 object
            Person person2 = (Person) person1.clone();
            person2.name = "Bob"; // Changing the name of the cloned object
            person2.display(); // Displaying the cloned object

            // Displaying the original object to show it remains unchanged
            person1.display();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
