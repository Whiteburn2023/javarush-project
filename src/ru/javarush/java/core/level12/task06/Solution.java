package ru.javarush.java.core.level12.task06;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // Создаем ассоциативный массив: ключ — имя студента, значение — его оценка
        // Добавляем запись: "Анна" -> 5
        // Проверяем, есть ли в словаре оценка для "Анны"
        // Получаем оценку и выводим сообщение

        HashMap<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Анна", 5);
        if (studentGrades.containsKey("Анна")){
            System.out.println("Оценка Анны: " + studentGrades.get("Анна"));
        }


    }
}