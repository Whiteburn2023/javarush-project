package ru.javarush.java.core.level21.task01;

public class Solution {
    public static void main(String[] args) {
        // Используем стандартный функциональный интерфейс Runnable:
        // у него нет параметров и нет возвращаемого значения.
        // Вызываем действие — сообщение будет напечатано на экран.

        Runnable runnable = () -> System.out.println("Лямбда без параметров!");

        runnable.run();

    }
}