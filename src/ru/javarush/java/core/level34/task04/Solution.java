package ru.javarush.java.core.level34.task04;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // Создаем изменяемую карту (рабочие настройки)
        Map<String, Integer> devSettings = new HashMap<>();
        devSettings.put("одна", 1);
        devSettings.put("две", 2);
        devSettings.put("три", 3);

        // Делаем "релизную" неизменяемую копию текущих настроек
        // Важно: это независимая копия, которую нельзя менять
        Map<String, Integer> releaseSettings = Map.copyOf(devSettings);

        // Проверяем неизменяемость: попытка добавить элемент должна вызвать исключение
        try {
            releaseSettings.put("четыре", 4);
        } catch (Exception e){
            System.out.println("Ошибка: карта неизменяема");
        }

        // В процессе разработки меняем исходные настройки
        devSettings.replace("одна", 100);

        // Печатаем обе карты, чтобы показать независимость копии
        System.out.println("Рабочая карта: " + devSettings);
        System.out.println("Релизная карта: " + releaseSettings);
    }
}