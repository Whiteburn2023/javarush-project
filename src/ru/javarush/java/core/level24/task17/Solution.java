package ru.javarush.java.core.level24.task17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        // Используем try-with-resources, чтобы поток автоматически закрылся
        try (BufferedReader reader = new BufferedReader(new FileReader("article_text.txt"))){
            String line;
            if ((line = reader.readLine()) != null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Ошибка чтения статьи!");
        } catch (IOException e) {
            System.out.println("Ошибка чтения статьи!");
        }

        // Читаем только первую строку файла — заголовок

            // На любую ошибку чтения выводим сообщение об ошибке


    }
}