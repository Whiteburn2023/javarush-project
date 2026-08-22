package ru.javarush.java.core.level29.task04;

import java.util.Comparator;

public class PersonByNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getPersonName().compareTo(p2.getPersonName());
    }
}
