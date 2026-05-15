package ru.javarush.java.core.level19.task11;

public abstract class Employee {

    String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract double getSalary();
}
