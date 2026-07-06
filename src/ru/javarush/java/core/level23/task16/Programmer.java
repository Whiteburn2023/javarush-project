package ru.javarush.java.core.level23.task16;

public class Programmer extends Worker implements Reportable{

    public Programmer(String employeeName) {
        super(employeeName);
    }

    @Override
    public void report() {
        System.out.println("Программист сдаёт отчёт");
    }

    @Override
    void work() {
        System.out.println("Программист пишет код");
    }
}
