package ru.javarush.java.core.level28.task08;

import java.util.EnumMap;

// Перечисление дней недели
enum Day {
    MON, TUE, WED, THU, FRI, SAT, SUN
}

public class Solution {
    public static void main(String[] args) {
        // Специализированная карта для enum-ключей: работает быстро и экономит память
        // Заполняем цены согласно условию
        // Получаем цену на субботу и выводим на экран
        EnumMap<Day, Integer> map = new EnumMap<>(Day.class);
        map.put(Day.MON, 100);
        map.put(Day.TUE, 120);
        map.put(Day.SAT, 200);
        System.out.println("SAT " + map.get(Day.SAT));
    }
}