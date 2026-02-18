package org.example;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test5 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("notebook", "pencil", "pen", "eraser", "notebook", "pen");

        Set<String> set = new HashSet<>();
        System.out.println(list.stream().filter(s -> !set.add(s)).collect(Collectors.toList()));

        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
        ));

        map.entrySet().stream().filter(m -> m.getValue() > 1).forEach((m) -> {
            System.out.println(m.getKey() + " = " + m.getValue());
        });


    }
}
