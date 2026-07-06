package ru.javarush.java.core.level21.task09;

public class MyCounter implements Counter{

    @Override
    public void increment() {
        System.out.println("Counter incremented");
    }

    @Override
    public void reset() {
        Counter.super.reset();
    }
}
