package ru.javarush.java.core.level19.task20;

public class HomeTask extends Task{

    String location;

    public HomeTask(String title, String location) {
        super(title);
        this.location = location;
    }

    @Override
    void complete() {
        System.out.println("домашняя задача " + getTitle() + ". выполнена в " + location);

    }
}
