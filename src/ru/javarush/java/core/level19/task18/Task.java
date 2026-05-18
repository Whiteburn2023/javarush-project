package ru.javarush.java.core.level19.task18;

public class Task {
    private String title;
    private boolean completed;

    public Task(String title) {
        this.title = title;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return "Task{title='" + title + "', completed=" + completed + "}";
    }
}
