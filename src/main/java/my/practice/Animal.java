package my.practice;

public abstract class Animal {

    public Animal() {
        System.out.println("constructor..");
    }

    public int count() {
        return 10;
    }

    public static void main(String[] args) {

    }
}

class Cat extends Animal {

    public int count() {
        return 11;
    }

    int callParent() {
        return super.count();
    }

    public static void main(String[] args) {
        Animal a = new Cat();
        System.out.println(a.count());

        Cat c = (Cat) a;
        System.out.println(c.count());
        System.out.println(c.callParent());
    }
}
