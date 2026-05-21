package ru.javarush.java.core.level20.task19;

public class FormalGreeting implements GreetingStrategy{

    @Override
    public void greet(String name) {
        System.out.println("Здравствуйте, " + name + ".");
    }
}
