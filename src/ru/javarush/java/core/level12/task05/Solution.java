package ru.javarush.java.core.level12.task05;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // Создаем ассоциативный массив (HashMap) для хранения переводов слов
        // Добавляем в словарь перевод: ключ "дом", значение "house"
        // Получаем перевод слова "дом" из словаря
        // Выводим перевод на экран

        Map<String, String> travelPhrasebook = new HashMap<>();
        travelPhrasebook.put("дом", "house");
        System.out.println(travelPhrasebook.get("дом"));

    }
}