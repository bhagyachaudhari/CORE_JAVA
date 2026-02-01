package org.example.java8.streamsapi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client5 {

    public static void main(String[] args) {
        String s = "tic for tac";
        HashMap<Character, Integer> map = new HashMap<>();
        s.chars().mapToObj(c -> (char) c).filter(ch -> !Character.isWhitespace(ch)).forEach((c) -> {

            if(map.get(c) == null) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c)+1);
            }

        });
        map.entrySet().forEach((e) -> System.out.print(e.getKey() + " - " + e.getValue() + " "));

        System.out.println();

        Map<Character, Long> freqMap = s.chars().parallel().mapToObj(c->(char)c).filter(c->!Character.isWhitespace(c))
                .collect(Collectors.groupingBy(
                        Character::charValue,
                        Collectors.counting()
                ));
        freqMap.entrySet().forEach((e) -> System.out.print(e.getKey() + " - " + e.getValue() + " "));
    }
}
