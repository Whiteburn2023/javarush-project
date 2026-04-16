package ru.javarush.java.core.level13.task19;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Solution {
    public static void main(String[] args) {
        // Текущая дата (берется из системных настроек)
        // Дата дедлайна проекта: 15 мая 2025 года
        // Количество дней между today и projectDeadline
        // Выводим результат на экран

        LocalDate projectDeadline = LocalDate.of(2025, 5, 15);
        LocalDate today = LocalDate.now();
        long daysRemaining = ChronoUnit.DAYS.between(today, projectDeadline);
        System.out.println(daysRemaining);

    }
}