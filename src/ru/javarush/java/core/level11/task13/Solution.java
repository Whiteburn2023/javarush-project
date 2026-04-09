package ru.javarush.java.core.level11.task13;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Solution {

    // Метод объявляет проброс исключения: обработка ошибки перекладывается на вызывающий код
    // Пытаемся открыть файл по указанному пути.
    // Если файл не найден, конструктор FileReader выбросит FileNotFoundException.
    public static void accessSecretDocument(String documentPath) throws FileNotFoundException {
        FileReader fileReader = new FileReader(documentPath);
    }


    // Небольшая демонстрация использования
    public static void main(String[] args) throws FileNotFoundException {
        accessSecretDocument("111.txt");

    }
}