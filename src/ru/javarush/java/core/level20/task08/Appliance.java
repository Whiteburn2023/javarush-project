package ru.javarush.java.core.level20.task08;

public abstract class Appliance {

    void turnOn(){
        System.out.println("Устройство включено");
    }

    abstract void work();
}
