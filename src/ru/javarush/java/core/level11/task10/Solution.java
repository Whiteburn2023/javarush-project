package ru.javarush.java.core.level11.task10;

public class Solution {
    // Метод выводит положительный счёт или генерирует исключение для неположительных значений
    public static void displayPositiveScore(int currentScore) {
        // Генерируем IllegalArgumentException с требуемым сообщением
        if (currentScore > 0) {
            System.out.println(currentScore);
        } else if (currentScore <= 0) {
            throw new IllegalArgumentException("Невозможно отобразить отрицательный счёт! Число отрицательное.");
        }
    }

    public static void main(String[] args) {
        // Корректный вызов: положительное значение
        displayPositiveScore(123);
        // Некорректный вызов: отрицательное значение, перехватываем исключение
        try {
            displayPositiveScore(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        // Выводим сообщение перехваченного исключения
    }
}