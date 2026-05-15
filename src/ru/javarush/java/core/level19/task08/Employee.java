package ru.javarush.java.core.level19.task08;

public abstract class Employee {

    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract double getSalary();
}
