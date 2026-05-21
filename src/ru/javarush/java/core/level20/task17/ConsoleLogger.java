package ru.javarush.java.core.level20.task17;

public class ConsoleLogger implements Logger{

    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
