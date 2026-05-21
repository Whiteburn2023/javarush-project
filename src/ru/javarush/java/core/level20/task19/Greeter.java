package ru.javarush.java.core.level20.task19;

public class Greeter implements GreetingStrategy{

    private GreetingStrategy strategy;

    public void greet(String name) {
        if (strategy == null){
            return;
        }
        strategy.greet(name);
    }

    public void setStrategy(GreetingStrategy strategy){
        this.strategy = strategy;
    }
}
