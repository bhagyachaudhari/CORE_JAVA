package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test1 {

    public static void main(String args[]) {

        String str = "aab";

        //output = aab,baa,aba

        // 0th =>     a__               b__
        // 1st => aa_     ab_           ba_
        // 2nd => aab     aba           baa


        // 3!/2!X1! = 3

        List<String> ans = new ArrayList<>();
        int[] freq = new int[26]; //[2, 1, 0, 0..]

        str.chars().forEach((ch)->{
            freq[ch - 97]++;
        });
        int idx = 0;
        StringBuilder output = new StringBuilder();
        permut(idx, freq, ans, str, output);

        // Generate all unique permutations as a Stream
        List<String> permutations = permutations(str)
                .distinct()   // remove duplicates
                .collect(Collectors.toList());

        // Print the result
        System.out.println(String.join(",", permutations));


    }

    private static void permut(int idx, int[] freq, List<String> ans, String str, StringBuilder output) {

        if(idx == freq.length) {
            ans.add(output.toString());
        }

        for(int i = 0; i < freq.length; i++) {

            if(freq[i] > 0) {
                freq[i]--;
                output.append(str.charAt(i));
                permut(idx+1, freq, ans, str, output);
                output.deleteCharAt(output.length()-1);
                freq[i]++;
            }
        }

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


