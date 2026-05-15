package ru.javarush.java.core.level19.task10;

public class Square extends Figure{

    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }
}
