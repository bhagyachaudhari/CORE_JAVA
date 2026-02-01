package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test1 {

    public static void main(String args[]) {

        String str = "aab";

        //output = aab,baa,aba

        // Generate all unique permutations as a Stream
        List<String> permutations = permutations(str)
                .distinct()   // remove duplicates
                .collect(Collectors.toList());

        // Print the result
        System.out.println(String.join(",", permutations));
    }

    // Recursive method that returns a Stream of permutations
    public static Stream<String> permutations(String str) {
        if (str.length() == 0) {
            return Stream.of("");
        }

        char firstChar = str.charAt(0);
        String remainder = str.substring(1);

        return permutations(remainder)
                .flatMap(s -> IntStream.rangeClosed(0, s.length())
                        .mapToObj(i -> s.substring(0, i) + firstChar + s.substring(i))
                );
    }
}

// aab
// ab =>
// b => firstChar = b, remainder = ""
// "" => ""





 /*// a = 2, b = 1

        // aab, baa
        char[] chars = str.toCharArray();

        for(int i = 0; i < chars.length; i++) {

            for(int j = 1; j < chars.length; j++) {

                *//*char ch = str.charAt(i);
                char nextch = str.charAt(j);*//*
                //char ch = chars[i];
                //char nextch = chars[j];

                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;

                System.out.println(chars);
            }


        }*/


