package my.practice;

public final class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name; // String is immutable
    }

    public int getAge() {
        return age;
    }

    public void display(int a, String b) {

    }

    public void display( String b, int a) {

    }

    /*public void test(String[] a) {

    }

    public void test(String... str) {

    }*/

    public void test(int a, String... str) {

    }

    public static void main(String[] args) {
        Person p1 = new Person("", 1);
        p1.display(1, "1");
        p1.display("3", 3);
    }
}
