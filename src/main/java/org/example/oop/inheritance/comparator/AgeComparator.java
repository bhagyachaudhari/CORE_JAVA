package org.example.oop.inheritance.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getAge() < o2.getAge())
            return 1;
        else if(o1.getAge() > o2.getAge())
            return -1;

        return 0;
    }
}
