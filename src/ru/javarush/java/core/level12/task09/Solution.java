package ru.javarush.java.core.level12.task09;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Создаем объект Path для файла "note.txt" в текущей директории
        // Строка, которую нужно записать в файл
        // Записываем строку в файл с использованием кодировки UTF-8

        Path path = Path.of("note.txt");
        String text = "Сегодня отличный день!";
        if (!Files.exists(path)){
            Files.createFile(path);
        }
        Files.writeString(path, text, StandardCharsets.UTF_8);


    }
}