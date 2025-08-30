package org.example.exception;

public class Demo {

    public static void main(String[] args) {
        try {
            int[] num = {1, 0, 3};
            for(int i = 0; i < num.length; i++) {
                System.out.println(10 / num[i]);
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed - " + e);
            throw e; // Rethrow the exception
        }
    }
}
