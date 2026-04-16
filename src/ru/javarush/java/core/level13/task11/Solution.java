package ru.javarush.java.core.level13.task11;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Solution {
    public static void main(String[] args) {
        // Локальная дата-время телепорта (без привязки к часовому поясу)
        // Часовой пояс Минска
        // Привязываем локальное время к Минску — получаем конкретное мгновение
        // Переводим то же самое мгновение в часовой пояс Нью-Йорка
        // Выводим оба значения, чтобы увидеть разницу представлений одного мгновения

        LocalDateTime teleportScheduledLocal = LocalDateTime.of(2025, 6,1,18,0);
        ZonedDateTime teleportTimeMinskZoned = teleportScheduledLocal.atZone(ZoneId.of("Europe/Minsk"));
        ZonedDateTime teleportTimeNewYorkZoned = teleportTimeMinskZoned.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(teleportTimeMinskZoned);
        System.out.println(teleportTimeNewYorkZoned);

    }
}