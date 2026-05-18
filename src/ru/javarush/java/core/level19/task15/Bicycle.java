package ru.javarush.java.core.level19.task15;

public class Bicycle extends Vehicle{

    String model;

    public Bicycle(String model) {
        this.model = model;
    }

    @Override
    void move() {
        System.out.println("Велосипед " + model +" едет");
    }
}
