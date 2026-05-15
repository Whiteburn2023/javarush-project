package ru.javarush.java.core.level18.task20;

public class Cat extends Animal{

    protected String name;

    public Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + ": Мяу!");
    }
}
