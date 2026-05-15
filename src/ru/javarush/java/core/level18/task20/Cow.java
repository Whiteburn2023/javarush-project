package ru.javarush.java.core.level18.task20;

public class Cow extends Animal{

    protected String name;

    public Cow(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + ": Мууу!");
    }
}
