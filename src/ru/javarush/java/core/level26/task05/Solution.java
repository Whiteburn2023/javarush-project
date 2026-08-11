package ru.javarush.java.core.level26.task05;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        // Создаём Map: ключ — название дня недели (String), значение — его номер (Integer)
        // Добавляем элементы согласно условию задачи
        // Проходим по всем парам ключ-значение и выводим в требуемом формате

        Map<String, Integer> map = new HashMap<>();
        map.put("Monday",1);
        map.put("Tuesday",2);
        map.put("Wednesday",3);

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("День: " + entry.getKey() + ", Номер: " + entry.getValue());
        }


    }
}