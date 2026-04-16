package ru.javarush.java.core.level13.task08;

import java.time.LocalDateTime;

public class Solution {
    public static void main(String[] args) {
        // Исходная дата и время брифинга: 1 июня 2025 года, 14:00
        // Прибавляем 2 часа, затем вычитаем 30 минут и сохраняем результат.
        // Выводим итоговое время старта миссии

        LocalDateTime missionBriefing = LocalDateTime.of(2025, 6, 1, 14, 0);
        missionBriefing = missionBriefing.plusHours(2);
        LocalDateTime finalMissionTime = missionBriefing.minusMinutes(30);
        System.out.println(finalMissionTime);

    }
}