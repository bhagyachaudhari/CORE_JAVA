package org.example.oop.abstraction.comparator;

import java.util.Comparator;

class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.name.compareTo(p2.name);  // Alphabetical order
    }
}
