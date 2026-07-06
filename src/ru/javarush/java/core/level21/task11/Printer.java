package ru.javarush.java.core.level21.task11;

public interface Printer {

    public abstract void print(String message);

    default void printTwice(String message){
        print(message);
        print(message);
    }
}
