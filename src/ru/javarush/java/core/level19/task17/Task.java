package ru.javarush.java.core.level19.task17;

public abstract class Task {

    protected String title;

    public Task(String title) {
        this.title = title;
    }

    abstract void complete();
}
