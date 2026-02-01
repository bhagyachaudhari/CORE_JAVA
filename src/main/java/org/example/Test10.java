package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test10 {

    public static void main(String[] args) {


        List<String> words = Arrays.asList("eat","tea","tan","ate","nat");

        // eat

        /*Map<String, Long> map = words.stream()
                .sorted(Comparator.comparing(String::valueOf))
                .collect(Collectors.groupingBy(
                        String::valueOf,
                        Collectors.counting()
                ));
*/

        Map<String, Long> map = words.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(), // or String::valueOf
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        map.entrySet().stream().forEach(e -> System.out.println(e.getKey() +" = "+e.getValue()));

        /*// freq[26]

        // eat, tea

        int freq[] = new int[26];
       *//* for(int i= 0; i < 26; i++) {

        }*//*


        for(int i = 0; i < words.size(); i++) {

            String word = words.get(i);
            for(int k = 0; k < word.length(); k++) {
                freq[97 + k]++;
            }
        }

        List<List<String>> output = new ArrayList<>();
        for(int i = 0; i < words.size(); i++) {
            List<String> nested = new ArrayList<>();
            String word = words.get(i); //eat
            nested.add(word);
            for(int k = 0; k < word.length(); k++) {
                String nextWord = words.get(k); //tea
                *//*if(checkFreq(word.charAt(k), nextWord.charAt(k), freq)) {
                    nested.add(nextWord);
                }*//*

            }
        }*/


    }

    /*private static boolean checkFreq(char word, char nextWord, int[] freq) {

        for (int i = 0; i < 26; i++) {
            if(freq[word] == freq[nextWord]) {

            }
        }

    }*/


}
