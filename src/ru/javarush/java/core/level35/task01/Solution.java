package ru.javarush.java.core.level35.task01;

import java.io.File;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект File, представляющий файл "дневник.txt" в текущей директории
        File file = new File("дневник.txt");

        // Проверяем существование файла с помощью метода exists()
        if (file.exists()){
            System.out.println("Файл найден!");
        } else {
            System.out.println("Файл не найден!");
        }

    }
}