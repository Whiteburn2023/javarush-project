package ru.javarush.java.core.level19.task06;

public class Phone extends Device{
    @Override
    void turnOn() {
        System.out.println("Телефон включен");
    }

    @Override
    void turnOff() {
        super.turnOff();
    }
}
