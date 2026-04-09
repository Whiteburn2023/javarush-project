package ru.javarush.java.core.level10.task15;

// Перечисление дней недели: каждое значение — отдельный день.
enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}


public class Solution {
    public static void main(String[] args) {
        // Используем цикл for-each для перебора всех значений перечисления DayOfWeek
        for (DayOfWeek day : DayOfWeek.values()){
            System.out.println(day);
        }

    }
}