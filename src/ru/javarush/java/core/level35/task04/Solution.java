package ru.javarush.java.core.level35.task04;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) {
        // Путь к корневой папке с исходниками (относительный к текущей директории запуска)
        Path dir = Paths.get("source_code");

        // Имя "главного" файла
        Path file = Paths.get("Application.java");

        // Объединяем путь к папке с именем файла через resolve (правильный способ склеивания путей)
        Path resolve = dir.resolve(file);

        // Преобразуем к абсолютному пути, чтобы сборщик видел полный путь в системе
        Path absolutePath = resolve.toAbsolutePath();

        // Выводим абсолютный путь на экран
        System.out.println(absolutePath);

    }
}