package ru.javarush.java.core.level27.task07;

import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        // Создаем NavigableMap, чтобы быстро находить порог по баллам
        // Заполняем карту: ключ — минимальные баллы, значение — название уровня
        // Считываем количество баллов клиента
        // Находим наибольший ключ, не превышающий количество баллов
        // Получаем и выводим название уровня (если порога нет — выводим сообщение)

        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        navigableMap.put(1, "бронзовый");
        navigableMap.put(3, "серебряный");
        navigableMap.put(5, "золотой");
        navigableMap.put(7, "платиновый");

        int scanner = new Scanner(System.in).nextInt();
        int key = 0;
        if (navigableMap.floorKey(scanner) != null){
            key = navigableMap.floorKey(scanner);
            System.out.println(navigableMap.get(key));
        } else {
            System.out.println("проверь значение!");
        }

    }
}