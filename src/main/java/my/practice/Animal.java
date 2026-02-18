package my.practice;

public abstract class Animal {
    public static String type = "Pet";

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

    public Cat(){
        super();
        //this();
    }

    public int count() {
        return 11;
    }

    int callParent() {
        System.out.println(super.type);
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
