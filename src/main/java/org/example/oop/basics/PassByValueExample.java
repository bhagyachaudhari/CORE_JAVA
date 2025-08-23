package org.example.oop.basics;

public class PassByValueExample {
    public static void modify(int num) {
        num = 20;  // Changing local copy
    }

    public static void main(String[] args) {
        int a = 10;
        modify(a);
        System.out.println(a);  // Output: 10 (original remains unchanged)
    }
}
