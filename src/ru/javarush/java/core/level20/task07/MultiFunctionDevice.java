package ru.javarush.java.core.level20.task07;

public class MultiFunctionDevice implements Printable, Scannable{

    @Override
    public void print() {
        System.out.println("Печать...");
    }

    @Override
    public void scan() {
        System.out.println("Сканирование...");
    }
}
