package org.example.oop.staticexamples;

public class Main {
    public static void main(String[] args) {
        System.out.println(MathUtil.square(5)); // Output: 25

        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
        nested.display();

        OuterClass1 outer = new OuterClass1();
        OuterClass1.InnerClass inner = outer.new InnerClass();
        inner.display();

        OuterClass2 outer2 = new OuterClass2();
        outer2.outerMethod();

        Greeting greet = new Greeting() {  // Anonymous inner class
            public void sayHello() {
                System.out.println("Hello from Anonymous Inner Class");
            }
        };
        greet.sayHello();
    }
}
