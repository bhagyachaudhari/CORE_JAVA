package my.practice.java8.stringjoiner;

import java.util.StringJoiner;

public class Test {

    public static void main(String[] args) {
        StringJoiner s = new StringJoiner(",");
        s.add("a");
        s.add("b");
        s.add("c");
        System.out.println(s);

        s.add(null);
    }
}
