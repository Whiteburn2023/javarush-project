package ru.javarush.java.core.level35.task03;

import org.w3c.dom.ls.LSOutput;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Path, указывающий на директорию "game_assets"
        Path dir = Paths.get("game_assets");


        // Проверяем, существует ли путь и является ли он директорией
        Files.exists(dir);
        boolean directory = Files.isDirectory(dir);


        // Выводим однозначный результат
        if (directory == true) {
            System.out.println("найдена");
        } else {
            System.out.println("не найдена");
        }

    }
}