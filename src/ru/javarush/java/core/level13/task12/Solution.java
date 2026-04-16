package ru.javarush.java.core.level13.task12;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Solution {
    public static void main(String[] args) {
        // 1) Создаем ZonedDateTime для 1 июня 2025 года, 12:00 в зоне Europe/Minsk
        // 2) Преобразуем ZonedDateTime в абсолютное мгновение Instant (UTC, часовой пояс не влияет)
        // 3) Тот же самый Instant отображаем как локальное время для зоны Asia/Tokyo
        // 4) Выводим все три значения

        LocalDateTime localDateTime = LocalDateTime.of(2025,6,1,12,0);
        ZonedDateTime originalEventTime = ZonedDateTime.of(localDateTime, ZoneId.of("Europe/Minsk"));
        Instant universalInstant = originalEventTime.toInstant();
        ZonedDateTime eventTimeTokyoZoned = universalInstant.atZone(ZoneId.of("Asia/Tokyo"));
        System.out.println(originalEventTime);
        System.out.println(universalInstant);
        System.out.println(eventTimeTokyoZoned);

    }
}