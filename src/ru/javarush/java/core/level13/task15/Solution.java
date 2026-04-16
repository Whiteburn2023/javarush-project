package ru.javarush.java.core.level13.task15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект LocalDate с датой 15 марта 2023 года
        // Готовим форматтер с шаблоном "dd.MM.yyyy" (например, "15.03.2023")
        // Форматируем дату в строку с учетом заданного шаблона
        // Выводим получившуюся строку на экран

        LocalDate specificEventDate = LocalDate.of(2023, 3, 15);
        String friendlyDisplayDateString = specificEventDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println(friendlyDisplayDateString);

    }
}