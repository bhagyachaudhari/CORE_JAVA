package org.example.java17;

public class SwitchPatternMatching {

    public static void main(String[] args) {
        Object obj = 123;

        String result = switch (obj) {
            case String s -> "It's a string: " + s;
            case Integer i -> "It's an integer: " + (i * 2);
            case Double d -> "It's a double: " + d;
            case null -> "It's null";
            default -> "Unknown type";
        };

        System.out.println(result);
    }
}
