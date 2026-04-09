package ru.javarush.java.core.level11.task05;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменные по условию
        int totalDistance = 100;
        int stepsPerUnit = 0;

        try {
            // Пытаемся выполнить деление, которое вызовет ArithmeticException (деление на ноль)
            // Этот вывод здесь для наглядности (не будет выполнен при stepsPerUnit = 0)
            int unit = totalDistance / stepsPerUnit;
            System.out.println(unit);


        } catch (ArithmeticException e) {
            // Дружелюбное сообщение для оператора при делении на ноль
            System.out.println("Робот сообщает: Деление на ноль невозможно! Пожалуйста, проверьте сенсоры.");


        }
    }
}