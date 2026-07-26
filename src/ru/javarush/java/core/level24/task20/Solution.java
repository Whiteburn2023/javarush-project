package ru.javarush.java.core.level24.task20;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        // try-with-resources: одновременно открываем "читателя" и "писателя".
        try (BufferedReader reader = new BufferedReader(new FileReader("ancient_manuscript.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("digital_archive.txt"))) {

            String line;
            while ((line = reader.readLine()) != null){
                writer.write(line);
                writer.newLine();
            }


        } catch (IOException e) {
            System.out.println("Ошибка копирования рукописи!");
        }


        // Читаем исходный файл построчно и сразу записываем каждую строку в целевой



            // Если произошла ошибка при чтении/записи — выводим требуемое сообщение

    }
}