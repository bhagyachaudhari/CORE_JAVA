package org.example.java8.stringexamples;

import java.util.StringJoiner;

public class StringJoinerDemo {

    public static void main(String args[]){

        StringJoiner sj = new StringJoiner(":");
        sj.add("1").add("2").add("3");
        StringJoiner sj1 = new StringJoiner(",");
        sj1.add("100").add("200").add("300");
        sj.merge(sj1);
        System.out.println(sj);
    }

}
