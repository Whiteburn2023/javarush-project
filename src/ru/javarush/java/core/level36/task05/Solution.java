package ru.javarush.java.core.level36.task05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) {
        // Исходный массив байтов образца данных
        byte[] data = {1, 2, 3, 4, 5, 6, 7, 8};

        // Имя выходного бинарного файла
        String fileName = "ценный_фрагмент.bin";

        // Записываем ровно 4 байта, начиная с индекса 2 (элементы 3, 4, 5, 6)
        // Используем специализированный метод write(byte[], int offset, int length)
        try (FileOutputStream fos = new FileOutputStream(fileName)){
            fos.write(data, 2,4);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}