package ru.javarush.java.core.level28.task01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем изменяемый список с начальными значениями
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(-3);
        list.add(8);
        list.add(-1);
        list.add(0);
        list.add(4);
        list.add(-7);

        // Обходим список с помощью Iterator, чтобы безопасно удалять элементы во время обхода
        // Выводим обновленный список без отрицательных чисел

        Iterator<Integer> positive =  list.iterator();
        while (positive.hasNext()){
            if (positive.next() < 0){
                positive.remove();
            }
        }

        for (Integer i : list) {
            System.out.println(i);
        }
    }
}