package ru.javarush.java.core.level17.task10;

public class Car extends Vehicle{
    private int manufacturingYear;

    public Car(String carBrand, int manufacturingYear) {
        super(carBrand);
        System.out.println("Машина "+ carBrand + ", год: " + manufacturingYear);
    }
}
