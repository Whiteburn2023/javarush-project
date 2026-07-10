package ru.javarush.java.core.level24.task03;

import java.io.FileNotFoundException;

public class Solution {
    public static void main(String[] args) {
        // "Неожиданный сбой": RuntimeException — непроверяемое (unchecked) исключение
        RuntimeException unexpectedGlitch = new RuntimeException();
        // unchecked: неожиданная угроза

        // "Потерянный файл конфигурации": FileNotFoundException — проверяемое (checked) исключение
        FileNotFoundException missingConfigurationFile = new FileNotFoundException();
        // checked: критически важная угроза

        // Выводим классификацию исключений
        System.out.println("RuntimeException — unchecked");
        System.out.println("FileNotFoundException — checked");

    }
}