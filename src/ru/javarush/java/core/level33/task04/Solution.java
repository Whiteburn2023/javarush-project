package ru.javarush.java.core.level33.task04;

import java.util.List;
import java.util.Optional;

public class Solution {
    public static void main(String[] args) {
        // Список номеров сокровищ
        List<Integer> treasures = List.of(10, 15, 20, 25, 30);

        // Ленивая обработка:
        // peek печатает только для реально обработанных элементов,
        // findFirst останавливает обработку, как только найден первый подходящий элемент
        Integer artifact = treasures.stream()
                .peek(i -> System.out.println("Проверяю: " + i))
                .filter(i -> i % 20 == 0)
                .findFirst()
                .orElseThrow();


        // Выводим номер найденного артефакта
        System.out.println(artifact);
    }
}