package ru.javarush.java.core.level28.task04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаём вложенный список сундуков с камнями
        List<List<Integer>> treasureChests = List.of(
                List.of(1, 2),
                List.of(3, 4, 5),
                List.of(6)
        );

        // Новый список, куда соберём все камни в исходном порядке
        List<Integer> allGems = new ArrayList<>();

        // Проходим по каждому "сундуку" и добавляем его содержимое
//        for (List<Integer> chest : treasureChests) {
//            allGems.addAll(chest);
//        }
        treasureChests.stream().forEach(i -> allGems.addAll(i));



        // Выводим объединённый список
        System.out.println(allGems); // Ожидаемый результат: [1, 2, 3, 4, 5, 6]
    }
}