package ru.javarush.java.core.level12.task11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        // 1) Создаем массив байтов с ASCII-кодами букв H, I, J
        // 2) Записываем массив в бинарный файл "letters.bin"
        // 3) Читаем содержимое файла обратно в новый массив байтов
        // 4) Выводим каждый байт как символ, разделяя пробелами

        byte[] asc = new byte[]{72, 73, 74};
        Path path = Path.of("letters.bin");
        if (!Files.exists(path)){
            Files.createFile(path);
            Path write = Files.write(path, asc);
        }
        byte[] bytes = Files.readAllBytes(path);
        for (int i = 0; i < bytes.length; i++){

            System.out.print((char) bytes[i] + " ");
        }

    }
}