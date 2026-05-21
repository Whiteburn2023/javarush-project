package ru.javarush.java.core.level20.task15;

import java.util.function.Predicate;

public class Solution {
    public static void main(String[] args) {
        // Предикат проверяет, что длина строки больше 5 символов
        Predicate<String> isLong = str -> str.length() > 5;


        // Демонстрация работы на двух примерах
        System.out.println(isLong.test("Java"));
        System.out.println(isLong.test("FunctionalInterface"));

    }
}