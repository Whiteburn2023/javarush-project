package ru.javarush.java.core.level23.task16;

public abstract class Worker {

    private String employeeName;

    public Worker(String employeeName) {
        this.employeeName = employeeName;
    }

    abstract void work();
}
