package org.example.collections.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Client1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }

        List<Integer> list1 = List.of(1, 2, 2);
        list1.stream().collect(Collectors.toSet())
                .forEach(System.out::println);

        ListIterator<Integer> listIterator = list1.listIterator();
        //listIterator.hasPrevious(); // This will return false since we are at the start of the list
        //listIterator.previous(); // This will throw NoSuchElementException since there is no previous element at the start
        listIterator.remove();
        listIterator.add(1);
        listIterator.nextIndex(); // This will return 1 since we have added an element and the next index is now 1
        listIterator.previousIndex(); // This will return -1 since we are at the start of the list and there is no previous index
        while(listIterator.hasNext()) {

            Integer value = listIterator.next();
            System.out.println(value);
        }
    }
}
