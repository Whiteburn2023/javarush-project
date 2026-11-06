package ru.javarush.java.core.level35.task02;

import java.io.File;

public class Solution {
    public static void main(String[] args) {
        // Работаем с файлом "my_game_save.dat" в текущей (рабочей) директории
        File file = new File("my_game_save.dat");

        // Проверяем существование и то, что это именно файл, а не папка
        if (file.exists() && file.isFile()){
            System.out.println("Размер сохранения: " + file.length() + " байт");
        } else {
            System.out.println("Файл сохранения не найден!");
        }

    }
}