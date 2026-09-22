package ru.javarush.java.core.level33.task02;

import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        // Исходный список названий заклинаний
        List<String> ancientSpells = List.of("Java", "Stream", "API", "IntStream");

        // Преобразуем Stream<String> в IntStream с помощью mapToInt,
        // чтобы получить примитивные int (без автоупаковки в Integer),
        // и печатаем каждую длину на новой строке.
        IntStream intStream = ancientSpells.stream().mapToInt(String::length);
        intStream.forEach(System.out::println);
    }
}