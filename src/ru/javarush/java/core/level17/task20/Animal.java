package ru.javarush.java.core.level17.task20;

public class Animal {

    void makeSound(){
        System.out.println("Some sound");
    }

    void sleep(){
        System.out.println("Animal is going to sleep...");
        makeSound();
    }
}
