package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test11 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("eat","tea","tan","ate","nat");

        // eat

        Map<String, List<String>> groupedAnagrams =
                words.stream()
                        .collect(Collectors.groupingBy(word -> {
                            char[] chars = word.toCharArray();
                            Arrays.sort(chars);
                            return new String(chars);
                        }));

        System.out.println(groupedAnagrams.values());
    }
}
