package ru.javarush.java.core.level27.task02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        // List хранит все предметы, включая повторы
        // Set хранит только уникальные предметы (повторы игнорируются)
        // Добавляем идентификаторы 3, 7, 3, 9 в обе коллекции
        // Выводим количество: сначала общее (List), затем уникальное (Set)

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        list.add(3);
        list.add(7);
        list.add(3);
        list.add(9);
        set.add(3);
        set.add(7);
        set.add(3);
        set.add(9);

        System.out.println(list.size());
        System.out.println(set.size());


    }
}