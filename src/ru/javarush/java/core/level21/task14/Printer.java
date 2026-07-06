package ru.javarush.java.core.level21.task14;

public interface Printer {

    public abstract void print(String text);

    public static void printHello(Printer printer){
        printer.print("Hello, world!");
    }
}
