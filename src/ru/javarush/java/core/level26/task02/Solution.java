package ru.javarush.java.core.level26.task02;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // Создаем "картотеку" студентов: ключ — имя (String), значение — возраст (Integer)
        Map<String, Integer> students = new HashMap<>();
        students.put( "Иван", 20);
        students.put( "Мария", 21);
        students.put( "Алексей", 19);
        System.out.println(students.toString());


        // Добавляем три записи о студентах


        // Выводим полный список всех студентов и их возрастов

    }
}