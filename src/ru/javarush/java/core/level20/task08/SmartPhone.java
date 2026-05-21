package ru.javarush.java.core.level20.task08;

public class SmartPhone extends Appliance implements Chargeable{

    @Override
    void work() {
        System.out.println("Смартфон работает");
    }

    @Override
    public void charge() {
        System.out.println("Смартфон заряжается");
    }
}
