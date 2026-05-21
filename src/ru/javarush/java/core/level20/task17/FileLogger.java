package ru.javarush.java.core.level20.task17;

public class FileLogger implements Logger{

    @Override
    public void log(String message) {
        System.out.println("Лог записан в файл: " + message);
    }
}
