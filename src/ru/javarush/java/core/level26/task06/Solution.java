package ru.javarush.java.core.level26.task06;

import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        // TreeMap автоматически поддерживает сортировку ключей по алфавиту (естественный порядок String)
        // Добавляем данные о фруктах
        // Проходим по записям: порядок уже алфавитный благодаря TreeMap

        TreeMap<String, Integer> fruits = new TreeMap<>();
        fruits.put("pear", 6);
        fruits.put("apple", 2);
        fruits.put("banana", 4);

        for (var entry : fruits.entrySet()){
            System.out.println("Фрукт: " + entry.getKey() + ", Количество: " + entry.getValue());
        }
    }
}