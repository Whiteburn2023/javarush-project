package ru.javarush.java.core.level17.task14;

public class Car extends Vehicle{
    @Override
    void move() {
        super.move();
    }

    void beep(){
        System.out.println("Машина сигналит: Бип-бип!");
    }
}
