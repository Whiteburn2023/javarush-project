package ru.javarush.java.core.level24.task04;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        try {
            // Имитация поиска отчёта: намеренно бросаем исключение
            throw new FileNotFoundException("Отчёт не найден!");


        } catch (FileNotFoundException e) {
            // Самый специфичный план: файл отсутствует
            System.out.println("Отчёт не найден");

        } catch (IOException e) {
            // Более общий план: проблемы ввода-вывода
            System.out.println("Общие проблемы с доступом к данным");

        } catch (Exception e) {
            // Самый общий план: любая другая непредвиденная ситуация
            System.out.println("Непредвиденной ситуации");

        }
    }
}