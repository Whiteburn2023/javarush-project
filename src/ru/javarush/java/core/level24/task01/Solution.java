package ru.javarush.java.core.level24.task01;

import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        // Создаем две "проблемы": сетевую (IOException) и пропажу данных (NullPointerException)
        IOException networkProblem = new IOException();
        NullPointerException missingDataError = new NullPointerException();

        // Для каждого исключения получаем непосредственный класс-родитель через рефлексию
        String name = networkProblem.getClass().getSuperclass().getName();
        String name1 = missingDataError.getClass().getSuperclass().getName();

        // Выводим имена родительских классов
        System.out.println(name);
        System.out.println(name1);

    }
}