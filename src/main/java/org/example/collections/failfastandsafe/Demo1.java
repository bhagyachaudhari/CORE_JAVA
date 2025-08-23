package org.example.collections.failfastandsafe;

import java.util.concurrent.CopyOnWriteArrayList;

public class Demo1 {

    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");

        for (String s : list) {
            System.out.println(s);
            list.add("C"); // No exception, change is allowed
        }
    }
}
