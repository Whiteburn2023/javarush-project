package ru.javarush.java.core.level32.task10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        // Создаем "свиток" — поток строк из трех заклинаний
        Stream<String> spells = Stream.of("one", "two", "three");

        // Первая терминальная операция: переписываем заклинания в список (магическую книгу)
        List<String> list = spells.collect(Collectors.toList());

        // Вторая терминальная операция над тем же потоком — запрещена:
        // Потоки в Java одноразовые. Повторное чтение приведет к IllegalStateException.
        long count = spells.count();

    }
}