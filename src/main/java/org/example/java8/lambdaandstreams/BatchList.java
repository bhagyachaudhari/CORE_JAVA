package org.example.java8.lambdaandstreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BatchList {

    public static void main(String[] args){
        List<Product> list = Arrays.asList(new Product(1, "PROD_1"), new Product(2, "PROD_1"),
                new Product(3, "PROD_2"), new Product(4, "PROD_3"),new Product(5, "PROD_2"),
                new Product(6, "PROD_4"),new Product(7, "PROD_5"));

        System.out.println(list);

        //batch list
        List<List<Product>> batchList = nPartition(list, 2);
        System.out.println(batchList);

        List<String> list1 = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "j", "K");

        System.out.println(list1);

        //batch list
        List<List<String>> batchList1 = nPartition1(list1, 2);
        System.out.println(batchList1);
        //printList(batchList1);

    }

    private static List<List<Product>> nPartition(List<Product> objs, final int N) {
        return new ArrayList<>(IntStream.range(0, objs.size()).boxed().collect(
                Collectors.groupingBy(e->e/N,Collectors.mapping(e->objs.get(e), Collectors.toList())
                )).values());
    }

    private static List<List<String>> nPartition1(List<String> objs, final int N) {
        return new ArrayList<>(IntStream.range(0, objs.size()).boxed().collect(
                Collectors.groupingBy(e->e/N,Collectors.mapping(e->objs.get(e), Collectors.toList())
                )).values());
    }

    private static List<List<?>> nPartition2(List<?> objs, final int N) {
        return new ArrayList<>(IntStream.range(0, objs.size()).boxed().collect(
                Collectors.groupingBy(e->e/N,Collectors.mapping(e->objs.get(e), Collectors.toList())
                )).values());
    }

    private static void printList(List<List<?>> batchList){
        System.out.println(batchList);
    }
}
