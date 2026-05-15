package ru.javarush.java.core.level19.task10;

public class Circle extends Figure{

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
