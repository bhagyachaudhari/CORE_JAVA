package org.example.java8.lambdaandstreams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class UpdateList {

    public static void main(String[] args){
        List<Product> list = Arrays.asList(new Product(1, "PROD_1"), new Product(2, "PROD_1"),
                new Product(3, "PROD_2"), new Product(4, "PROD_3"),new Product(5, "PROD_2"),
                new Product(6, "PROD_4"),new Product(7, "PROD_5"), null);

        System.out.println(list);

        //update list
        list.stream().filter(Objects::nonNull).forEach(p->p.setProdName(String.valueOf(p.getProdId() * 10)));
        System.out.println(list);

    }
}
