package ru.javarush.java.core.level19.task04;

public abstract class Payment {

    abstract void process();

    void printInfo(){
        System.out.println("Платёж обрабатывается");
    }
}
