package ru.javarush.java.core.level05.task06;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем Scanner для чтения строки с клавиатуры
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();


        // Проверяем палиндром двумя указателями: с начала и с конца

        boolean isPalindrom = false;

        for (int i = 0; i < str.length(); i++) {
            // Проверка чувствительна к регистру, сравниваем символы напрямую
            if (!(str.charAt(i) == str.charAt(str.length() - i - 1))) {
                isPalindrom = false;
                break; // Дальше проверять не нужно
            }
            isPalindrom = true;
        }

        // Вывод строго "YES" или "NO" без дополнительных сообщений
        System.out.println(isPalindrom ? "YES" : "NO");

    }
}