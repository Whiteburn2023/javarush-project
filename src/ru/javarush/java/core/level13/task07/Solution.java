package ru.javarush.java.core.level13.task07;

import java.time.LocalTime;

public class Solution {
    public static void main(String[] args) {
        // Создаем два объекта времени: утренняя встреча и дневная презентация
        // Сравниваем времена с помощью специализированного метода isBefore

        LocalTime morningMeeting = LocalTime.of(8, 0);
        LocalTime afternoonPresentation = LocalTime.of(14, 30);

        String strMorningMeeting =  "8:00 раньше 14:30";
        String strAfternoonPresentation = "8:00 не раньше 14:30";

        String s = morningMeeting.isBefore(afternoonPresentation) ? strMorningMeeting : strAfternoonPresentation;
        System.out.println(s);


    }
}