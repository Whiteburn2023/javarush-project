package ru.javarush.java.core.level25.task07;

public class Aircraft implements CanFly{

    @Override
    public void soar() {
        System.out.println("Самолёт взлетает!");
    }
}
