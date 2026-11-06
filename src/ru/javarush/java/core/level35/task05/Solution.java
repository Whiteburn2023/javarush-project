package ru.javarush.java.core.level35.task05;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Имя файла в каталоге запуска программы (относительный путь)
        String fileName = "encrypted_message.bin";
        int count = 0;

        // 1) Создаем файл и записываем в него любое содержимое
        Path file = Paths.get(fileName);
        try (FileOutputStream fos = new FileOutputStream("encrypted_message.bin")){
            fos.write(fileName.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2) Читаем файл побайтно и считаем каждый байт
        try (FileInputStream reader = new FileInputStream("encrypted_message.bin")){
            int b;
            while ((b = reader.read()) != -1){
                count++;
            }
        }

        // 3) Выводим результат в требуемом формате
        System.out.println("Размер документа: " + count + " байт");
    }
}