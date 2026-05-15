package ru.javarush.java.core.level19.task07;

public class Circle extends Shape{

    protected double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
