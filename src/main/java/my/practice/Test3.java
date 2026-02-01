package my.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test3 {

    public static void main(String[] args) {
        String str = new String("Java");
        str.concat(" Rocks");
        System.out.println(str);

        final StringBuilder sb = new StringBuilder("Java");
        sb.append(" Rocks");
        System.out.println(sb);

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (String s : list) {
            if (s.equals("B")) {
                list.remove(s);
                //list.add("d");
            }
        }
        System.out.println(list);

        ListIterator<String> itr = list.listIterator();
        while(itr.hasNext()) {
            itr.add("1");
            if (itr.next() == "A") {
                itr.remove();
            }
            //list.add("1");
            list.remove("C");
        }

        System.out.println(list);

        List<List<Integer>> list1 =
                List.of(List.of(1, 2), List.of(3, 4));

        list1.stream()
                .map(l -> l.stream())
                .forEach(System.out::println);

    }
}
