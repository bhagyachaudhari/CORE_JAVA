package my.practice.java8.interfaces;

public interface Flyable {

    public abstract void fly();

    default void display() {
        System.out.println("display....");
    }

}
abstract class Bird implements Flyable {
    @Override
    public void fly() {

    }

    /*public void display() {
        System.out.println("display....");
    }*/

    public abstract void display();


}
