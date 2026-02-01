package my.practice.oop;

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }

    @Override
    void makeSound() { // Overriding the method
        System.out.println("Dog makes sound");
    }


}
