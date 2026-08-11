package ru.javarush.java.core.level27.task08;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // Основной складской реестр: упорядоченное множество с навигационными методами
        // Добавляем идентификаторы товаров
        // Формируем "вид" на часть реестра: от 20 (включительно) до 50 (исключительно)
        // subSet в NavigableSet возвращает представление (view), связанное с исходным множеством
        // Удаляем поврежденный товар 30 из временного списка — изменение отразится и в реестре
        // Сначала выводим временный список отгрузки, затем основной реестр

        NavigableSet<Integer> navigableSet = new TreeSet<>(List.of(10, 20, 30, 40, 50));
        SortedSet<Integer> set = navigableSet.subSet(20, true, 50, false);
        set.remove(30);
        for (Integer i : set) {
            System.out.println("SortedSet " + i);
        }
        for (Integer i : navigableSet) {
            System.out.println("NavigableSet " + i);
        }
    }
}