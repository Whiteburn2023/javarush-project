package ru.javarush.java.core.level13.task18;

import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        // Текущая дата
        // Контрольная дата: 1 января 2025 года
        // Используем isBefore: если futureMilestone раньше today, значит 2025 уже наступил

        LocalDate futureMilestone = LocalDate.of(2025,1,1);
        LocalDate today = LocalDate.now();
        if (futureMilestone.isBefore(today)){
            System.out.println("2025 уже наступил");
        } else {
            System.out.println("2025 еще не наступил");
        }

    }
}