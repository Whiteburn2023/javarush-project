package ru.javarush.java.core.level11.task08;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменные primaryValue и secondaryValue
        int primaryValue = 10;
        int secondaryValue = 0;

        try {
            // Пытаемся выполнить деление primaryValue на secondaryValue
            System.out.println(primaryValue / secondaryValue);


        } catch (ArithmeticException e) {
            // Обрабатываем исключение деления на ноль
            System.out.println("Ошибка деления. Продолжаем работу системы.");


        }
        System.out.println("Миссия завершена. Программа завершена.");
        // Выводим финальное сообщение, подтверждающее завершение программы

    }
}