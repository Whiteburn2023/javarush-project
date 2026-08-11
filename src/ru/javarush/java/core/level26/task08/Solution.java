package ru.javarush.java.core.level26.task08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Исходный список с повторами
        // Используем Set для удаления дубликатов.
        // Выводим итоговый набор уникальных товаров

        List<String> list = new ArrayList<>();
        list.add("яблоко");
        list.add("груша");
        list.add("яблоко");
        list.add("слива");
        list.add("груша");

        LinkedHashSet<String> set = new LinkedHashSet<>(list);
        System.out.println(set);


    }
}