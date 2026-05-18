package ru.javarush.java.core.level19.task15;

public class Car extends Vehicle{
    String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    void move() {
        System.out.println("Машина " + model + " едет");
    }
}
