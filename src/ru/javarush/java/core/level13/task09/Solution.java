package ru.javarush.java.core.level13.task09;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        // Получаем текущее время в каждой указанной зоне через ZonedDateTime.now(ZoneId.of(...))
        // Простой и наглядный формат даты и времени (локальное время конкретной зоны)
        // Выводим каждую зону на отдельной строке: название города + локальное время

        ZonedDateTime currentTimeInMinsk = ZonedDateTime.now(ZoneId.of("Europe/Minsk"));
        ZonedDateTime currentTimeInNewYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime currentTimeInTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        String minsk = currentTimeInMinsk.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        String newYork = currentTimeInNewYork.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        String tokyo = currentTimeInTokyo.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        System.out.println("Minsk: " + minsk);
        System.out.println("New York: " + newYork);
        System.out.println("Tokyo: " + tokyo);

    }
}