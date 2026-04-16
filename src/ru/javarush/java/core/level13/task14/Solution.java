package ru.javarush.java.core.level13.task14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        // Входная строка с датой в формате ISO (год-месяц-день)
        String inputDateString = "2024-12-31";
        // Парсим строку в объект LocalDate, явно указывая стандартный ISO форматтер
        // Выводим полученный объект даты на экран

        LocalDate parsedLocalDate = LocalDate.parse(inputDateString, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parsedLocalDate);

    }
}