package ru.javarush.java.core.level19.task20;

public abstract class Task {

    String title;

    abstract void complete();

    public Task(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

