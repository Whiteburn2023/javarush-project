package ru.javarush.java.core.level34.task02;

import java.util.List;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        // Демонстрация запрета null в неизменяемых списках List.of
        try {
            List.of("кот", null, "собака");
        } catch (NullPointerException e) {
            System.out.println("Null запрещён: NullPointerException");
        }

        // Демонстрация запрета дубликатов в неизменяемых множествах Set.of
        try {
            Set.of("солнце", "луна", "солнце");
        } catch (IllegalArgumentException e) {
            System.out.println("Дубликаты запрещены: IllegalArgumentException");
        }

    }
}