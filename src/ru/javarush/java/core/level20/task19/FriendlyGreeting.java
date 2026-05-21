package ru.javarush.java.core.level20.task19;

public class FriendlyGreeting implements GreetingStrategy{

    @Override
    public void greet(String name) {
        System.out.println("Привет, " + name + "!");
    }
}
