package my.practice.interview;

class Parent {
    String name = "my.practice.interview.Parent";
    static void who() { System.out.println("my.practice.interview.Parent.who"); }
    void say() { System.out.println("my.practice.interview.Parent.say: " + name); }
}
class Child extends Parent {
    String name = "my.practice.interview.Child";
    static void who() { System.out.println("my.practice.interview.Child.who"); }
    @Override
    void say() { System.out.println("my.practice.interview.Child.say: " + name); }
}
public class Test6 {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.name); //my.practice.interview.Parent
        p.say(); //my.practice.interview.Child.say: my.practice.interview.Child
        p.who(); // my.practice.interview.Parent.who
    }
}