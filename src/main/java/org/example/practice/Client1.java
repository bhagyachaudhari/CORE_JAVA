package org.example.practice;

public class Client1 implements Cloneable {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException {
        System.out.println(new String("test").equals("test"));
        Client1 client1 = new Client1();
        Client1 client12 = (Client1) Class.forName("org.example.practice.Client1").newInstance();
        System.out.println(client12 == client1);
        System.out.println(client12.equals(client1));
        Client1 client13 = (Client1) client1.clone();
        System.out.println(client13);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
