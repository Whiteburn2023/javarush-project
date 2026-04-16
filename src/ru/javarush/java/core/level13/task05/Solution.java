package ru.javarush.java.core.level13.task05;

import java.time.LocalTime;

public class Solution {
    public static void main(String[] args) {
        // Получаем текущее время с помощью LocalTime.now()
        // Извлекаем часы, минуты и секунды из текущего времени
        // Выводим часы, минуты и секунды в заданном формате

        LocalTime currentTime = LocalTime.now();
        int displayHours = currentTime.getHour();
        int displayMinutes = currentTime.getMinute();
        int displaySeconds = currentTime.getSecond();
        System.out.println(
                "Часы: " + displayHours +
                        ", минуты: " + displayMinutes +
                        ", секунды: " + displaySeconds
        );



    }
}