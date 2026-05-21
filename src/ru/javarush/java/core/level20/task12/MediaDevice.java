package ru.javarush.java.core.level20.task12;

public class MediaDevice implements Player, Recorder{

    @Override
    public void play() {
        System.out.println("Воспроизведение");
    }

    @Override
    public void record() {
        System.out.println("Запись");
    }
}
