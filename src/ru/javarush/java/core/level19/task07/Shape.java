package ru.javarush.java.core.level19.task07;

public abstract class Shape {

    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract double area();
}
