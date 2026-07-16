package ru.javarush.java.core.level24.task13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) {
        // try-with-resources автоматически закроет файл даже при ошибках
        try (BufferedReader reader = new BufferedReader(new FileReader("daily_transactions.txt"))){
            String str = "";
            if ((str = reader.readLine()) != null){
                int parseInt = Integer.parseInt(str);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл транзакций не найден!");
        } catch (IOException e) {
            System.out.println("Ошибка чтения данных из файла!");
        } catch (NumberFormatException e) {
            System.out.println("В файле обнаружены некорректные финансовые данные!");
        }

            // Читаем первую строку из файла


            // Пустой файл или отсутствие первой строки считаем некорректными данными


            // Пытаемся преобразовать строку в целое число


            // Успешный сценарий: по условию ничего не выводим
            // (можно было бы вывести total, но этого не требуют)

            // Отдельный план для ситуации, когда файла нет

            // Отдельный план для некорректных данных в первой строке

            // Любые другие проблемы ввода-вывода при чтении файла

    }
}