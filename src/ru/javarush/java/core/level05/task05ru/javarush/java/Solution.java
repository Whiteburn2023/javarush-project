package ru.javarush.java.core.level05.task05;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем сканер для чтения числа с консоли
        Scanner scanner = new Scanner(System.in);
        int pyramidHeight = scanner.nextInt();


        // Строим обелиск строка за строкой
        for (int i = 1; i <= pyramidHeight; i++) {
            // Количество пробелов слева: уменьшается от (N - 1) до 0

            int space = pyramidHeight - i;

            // Количество звездочек: растет по формуле (2 * row - 1)

            int star = 2 * i - 1;

            // Печатаем пробелы для выравнивания
            for (int j = 0; j < space; j++) {
                System.out.print(" ");

            }
            // Печатаем звездочки
            for (int j = 0; j < star; j++) {
                System.out.print("*");

            }
            // Переход на новую строку после каждой строки обелиска
            System.out.println();

        }
    }
}