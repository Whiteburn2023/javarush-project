package ru.javarush.java.core.level21.task07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем список строк с фруктами
        // Сортируем список по алфавиту, используя ссылку на метод сравнения строк
        // Выводим каждый фрукт на новой строке

        List<String> list = new ArrayList<>();
        list.add("яблоко");
        list.add("банан");
        list.add("груша");

        list.sort(String::compareTo);

        for (String string : list) {
            System.out.println(string);
        }


    }
}