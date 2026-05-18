package ru.javarush.java.core.level19.task17;

public class SimpleTask extends Task{


    public SimpleTask(String title) {
        super(title);
    }

    @Override
    void complete() {
        System.out.println("Задача '" + title + "' выполнена");
    }
}
