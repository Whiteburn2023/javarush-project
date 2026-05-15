package ru.javarush.java.core.level18.task20;

public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();
}
