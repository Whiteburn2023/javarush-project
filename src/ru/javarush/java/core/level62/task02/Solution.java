package ru.javarush.java.core.level62.task02;

import java.io.IOException;
import java.lang.Class;
import java.lang.ClassNotFoundException;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Полное имя класса, который хотим загрузить динамически
        // Динамическая загрузка класса по имени
        // Получаем пакет класса и его имя
        // Выводим имя пакета на экран

        String className = "java.util.ArrayList";
        try {
            Class<?> aClass = Class.forName(className);
            String packageName = aClass.getPackageName();
            System.out.println(packageName);
        } catch (ClassNotFoundException e) {
        }



    }
}