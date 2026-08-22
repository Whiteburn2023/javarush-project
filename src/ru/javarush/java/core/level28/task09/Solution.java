package ru.javarush.java.core.level28.task09;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // Создаем LinkedHashMap с "порядком по обращению" (accessOrder = true).
        // Добавляем товары: ключ — код товара, значение — его id
        // Имитация просмотра товара "b": доступ через get переносит "b" в конец
        // Выводим ключи в текущем порядке обхода: ожидается a, c, b

        Map<String, Integer> map = new LinkedHashMap<>(16, 0.75f, true);
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);

        map.get("b");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }

    }
}