package ru.javarush.java.core.level36.task10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int wordCount = 0; // переменная для хранения количества слов
        Path path = Path.of("великий_манускрипт.txt");

        // Используем try-with-resources для автоматического закрытия Scanner

        try (Scanner scanner = new Scanner(path)){
            while (scanner.hasNext()){
                scanner.next();
                wordCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Выводим общее число слов на экран
        System.out.println(wordCount);
    }
}