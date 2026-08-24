package ru.javarush.java.core.level19.task20;

public class WorkTask extends Task{

    String deadline;

    public WorkTask(String title, String deadline) {
        super(title);
        this.deadline = deadline;
    }

    @Override
    void complete() {
        System.out.println("рабочая задача " + getTitle() + ". выполнена к сроку " + deadline);

    }
}
