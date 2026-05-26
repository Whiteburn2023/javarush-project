package ru.javarush.java.core.level21.task03;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // Исходный список результатов спортсменов
        // Компаратор-лямбда: сравниваем числа только по их абсолютному значению (знак игнорируется)
        // Сортируем список по возрастанию абсолютной величины
        // Выводим отсортированный список



        List<Integer> list = new ArrayList<>();
        list.add(-5);
        list.add(3);
        list.add(-2);
        list.add(7);
        list.add(0);

        Comparator sortByAbs = (a, b) -> Integer.compare(Math.abs((Integer) a), Math.abs((Integer) b));

        Collections.sort(list, sortByAbs);

        System.out.println(list);



    }
}