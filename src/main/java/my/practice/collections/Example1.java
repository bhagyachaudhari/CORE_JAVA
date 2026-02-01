package my.practice.collections;

import org.example.oop.inheritance.overriding.package1.A;

import java.util.*;

public class Example1 {
    public static void main(String[] args) {
/*        Deque d = new ArrayDeque();
        d.add(1);
        d.poll();
        d.peek();
        d.remove();

        d.addFirst(1);
        d.getFirst();
        d.removeFirst();
        d.pollFirst();*/


        List<Integer> list = Arrays.asList(5,3,4,1,2,8,7,6);
        Collections.sort(list);
        list.forEach(System.out::println);
        Collections.sort(list, Comparator.reverseOrder());
        list.forEach(System.out::println);
    }

}
