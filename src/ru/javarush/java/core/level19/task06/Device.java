package ru.javarush.java.core.level19.task06;

public abstract class Device {

    abstract void turnOn();

    void turnOff(){
        System.out.println("Устройство выключено");
    }
}
