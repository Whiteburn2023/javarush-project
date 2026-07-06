package ru.javarush.java.core.level21.task10;

public class Dog implements Animal{

    @Override
    public void voice() {
        System.out.println("Woof");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
