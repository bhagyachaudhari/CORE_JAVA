package org.example.java8.lambdaandstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NestedList {

    public static void main(String args[]){
        List<List<String>> lists = IntStream.range(0, 1)
                .mapToObj(i -> IntStream.range(0, 1)
                        .mapToObj(j -> "A")
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());

        System.out.println(lists);

        lists.stream().forEach(batch->{
            System.out.println(batch);
        });
    }

}

