package ru.javarush.java.core.level36.task03;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("эпическая_сага.txt");
        try {


            // Читаем содержимое файла целиком как одну строку в UTF-8


            String saga = Files.readString(file, StandardCharsets.UTF_8);
            saga = saga.replace("\r", "").replace("\n", "");

            System.out.println(saga);

            // Удаляем все переводы строк (\r и \n), чтобы получить непрерывный текст
            // Выводим результат на экран

        } catch (IOException e) {
            // При ошибке чтения или если файл не найден — выводим информацию об исключении
            e.printStackTrace();

        }
    }
}