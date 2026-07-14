package ru.javarush.java.core.level24.task12;

public class Solution {
    // Инициирует первый сбой без первопричины (cause == null)
    public static void initiateSystemFailure() throws FirstSystemFailure {
        throw new FirstSystemFailure("Проблема в ядре системы",null);

    }

    // Вызывает initiateSystemFailure и, при сбое, оборачивает его во второй уровень
    public static void triggerNavigationMalfunction() throws SecondSystemFailure {
        try {
            initiateSystemFailure();
        } catch (FirstSystemFailure e) {
            throw new SecondSystemFailure("Навигационная система отказала", e);
        }

    }

    // Вызывает triggerNavigationMalfunction и, при сбое, оборачивает его в третий уровень
    public static void provokeLifeSupportCrisis() throws ThirdSystemFailure {
        try {
            triggerNavigationMalfunction();
        } catch (SecondSystemFailure e) {
            throw new ThirdSystemFailure("Критический отказ системы жизнеобеспечения", e);
        }

    }

    public static void main(String[] args) {
        try {
            // Запускаем цепочку сбоев
            provokeLifeSupportCrisis();
        } catch (ThirdSystemFailure e) {
            // Печатаем полный стек-трейс с цепочкой причин (chained exceptions)

            e.printStackTrace();

        }
    }
}