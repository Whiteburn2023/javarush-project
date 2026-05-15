package ru.javarush.java.core.level19.task08;

public class Manager extends Employee{

    double baseSalary;

    public Manager(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    @Override
    double getSalary() {
        return baseSalary;
    }
}
