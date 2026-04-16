package ru.javarush.java.core.level13.task03;

import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        // Получаем текущую дату и сохраняем в переменной today
        // Вычисляем завтрашнюю дату на основе today
        // Выводим завтрашнюю дату на экран

        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        System.out.println(tomorrow);

    }
}