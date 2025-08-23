package org.example.java8.lambdaandstreams;

import java.util.*;
import java.util.stream.Collectors;

public class DistinctList {

    public static void main(String[] args){
        String pname = null;
        List<Product> list = Arrays.asList(new Product(1, "PROD_1"), new Product(2, "PROD_1"),
                new Product(3, "PROD_2"), new Product(4, "PROD_3"),new Product(5, "PROD_2"),
                new Product(6, "PROD_4"), null, new Product(7, (pname == null ? "" : pname)));

        System.out.println(list);
        //1.
        //List<Product> newList = list.stream().filter(distinctByKey(Product::getProdName)).collect(Collectors.toList());

        //2.
        //Set<String> set = new HashSet<>(list.size());
        //List<Product> newList = list.stream().filter(p -> set.add(p.getProdName())).collect(Collectors.toList());

        //3.
        List<String> newList = list.stream().filter(Objects::nonNull)
                .collect(Collectors.toCollection(
                        () -> new TreeSet<Product>((p1, p2) -> p1.getProdName().compareTo(p2.getProdName()))
                )).stream().map(p->p.getProdName()).collect(Collectors.toList());
        System.out.println(newList);
    }

    /*public static <Product> Predicate<Product> distinctByKey(Function<? super Product, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }*/

}
