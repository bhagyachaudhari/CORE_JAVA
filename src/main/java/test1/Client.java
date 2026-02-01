package test1;

public abstract class Client implements Animal, Bird {

    public static void main(String[] args) {

    }

    @Override
    public void eating() {
        Animal.super.eating();
    }

    @Override
    public void flying() {

    }

    public abstract void sleeping();
}

interface Animal {

    default void eating() {
        System.out.println("eating");
    }
}

interface Bird {

    default void eating() {
        System.out.println("eating");
    }

    public void flying();

    default void sleeping() {

    }

    private void singing() {

    }
}
