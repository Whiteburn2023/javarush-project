package ru.javarush.java.core.level28.task02;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем изменяемый список с исходными названиями животных
        // Удаляем все строки, длина которых меньше 4 символов
        // removeIf принимает условие (Predicate): если возвращает true — элемент удаляется
        // Выводим обновленный список после фильтрации

        List<String> list = new ArrayList<>(List.of("cat", "elephant", "dog", "tiger", "rat", "lion"));
        list.removeIf(n -> n.length() < 4 );
        System.out.println(list);
    }
}