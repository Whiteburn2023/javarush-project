package ru.javarush.java.core.level37.task02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Объявляем требуемые переменные
        String magicInscription = "Привет, Java!";
        String fileName = "output.txt";
        String savedScrollContent = "";

        // Запись строки в файл:
        // OutputStreamWriter оборачивает FileOutputStream, кодировка — UTF-8
        try (OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream(fileName), StandardCharsets.UTF_8)){
            osw.write(magicInscription);
        }

        // Чтение строки из файла:
        // InputStreamReader оборачивает FileInputStream, кодировка — UTF-8
        try (InputStreamReader isr = new InputStreamReader(
                new FileInputStream(fileName), StandardCharsets.UTF_8)){
            int read;
            while ((read = isr.read()) != -1){
                savedScrollContent +=(char) read;
            }
        }


        // Вывод восстановленного текста на экран
        System.out.println(savedScrollContent);

    }
}