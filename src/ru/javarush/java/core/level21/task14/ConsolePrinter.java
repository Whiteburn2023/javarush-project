package ru.javarush.java.core.level21.task14;

public class ConsolePrinter implements Printer{

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
