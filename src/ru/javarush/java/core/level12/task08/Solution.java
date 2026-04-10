package ru.javarush.java.core.level12.task08;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // Исходный текст для анализа
        String textContent = "java core java map";
        // Создаем HashMap для хранения статистики слов
        // Разбиваем текст на слова, используя пробел как разделитель
        // Подсчитываем количество вхождений каждого слова
            // Получаем значение из словаря
            // Если слово уже есть в HashMap, увеличиваем его счетчик
        // Выводим результаты подсчета на экран

        HashMap<String, Integer> words = new HashMap<>();
        String[] word = textContent.split(" ");
        int n = 1;
        for (int i = 0; i < word.length; i++) {
            if (words.containsKey(word[i])){
                words.put(word[i], words.get(word[i]) + 1);
            } else {
                words.put(word[i], 1);
            }
        }
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}