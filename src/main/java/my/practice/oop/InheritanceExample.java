package my.practice.oop;

public class InheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.getType(); //
        myDog.bark();      // Method from Dog class

        Animal animal = new Dog();
        animal.makeSound();
    }
}
