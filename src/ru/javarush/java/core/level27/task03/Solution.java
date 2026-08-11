package ru.javarush.java.core.level27.task03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        // Создаём словарь переводов: английское слово -> русский перевод
        // Заполняем словарь тремя парами
        // Перебираем пары через for-each по entrySet()
        // (под капотом используется Iterator, что и требуется по условию)
            // Форматированный вывод в виде "ключ = значение"

        HashMap<String, String> map = new HashMap<>();
        map.put("dog" , "собака");
        map.put("cat" , "кошка");
        map.put("bird" , "птица");

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
//        map.forEach((key, value) -> System.out.println(key + " - " + value));
    }
}