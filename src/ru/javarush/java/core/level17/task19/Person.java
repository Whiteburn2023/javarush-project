package ru.javarush.java.core.level17.task19;

public class Person {
    String humanName;

    public Person(String humanName) {
        this.humanName = humanName;
        System.out.println( "Person создан: " + humanName);
    }
}
