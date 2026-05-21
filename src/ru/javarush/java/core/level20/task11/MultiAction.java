package ru.javarush.java.core.level20.task11;

public class MultiAction implements InterfaceA, InterfaceB{

    @Override
    public void doAction() {
        System.out.println("Выполнено действие для обоих интерфейсов");
    }
}
