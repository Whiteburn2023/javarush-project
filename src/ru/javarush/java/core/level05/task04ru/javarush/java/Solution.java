package ru.javarush.java.core.level05.task04;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);
        int magicLimit = scanner.nextInt();


        // Запрашиваем у пользователя ввод числа N (magicLimit)


        // Вычисляем и выводим квадрат каждого числа от 1 до N
        for (int i = 1; i <= magicLimit;i++) {
            System.out.println(i * i);

        }
    }
}