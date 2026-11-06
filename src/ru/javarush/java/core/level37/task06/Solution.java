package ru.javarush.java.core.level37.task06;

import java.nio.charset.Charset;
import java.util.Map;
import java.util.SortedMap;

public class Solution {
    public static void main(String[] args) {
        // Получаем от JVM все доступные кодировки.
        // Метод возвращает отсортированную карту: ключ — каноническое (официальное) имя, значение — объект Charset.
        SortedMap<String, Charset> stringCharsetSortedMap = Charset.availableCharsets();

        // Перебираем все элементы карты (все поддерживаемые JVM кодировки)
        for(Map.Entry<String, Charset> entry : stringCharsetSortedMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}