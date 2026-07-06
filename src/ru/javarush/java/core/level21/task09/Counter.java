package ru.javarush.java.core.level21.task09;

public interface Counter {

    public abstract void increment();

    default void reset(){
        System.out.println("Counter reset");
    };

}
