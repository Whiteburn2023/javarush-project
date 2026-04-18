package ru.javarush.java.core.level05.task17;

public class Solution {
    public static void main(String[] args) {
        // Перебираем числа от 1 до 20
        for (int i = 1; i <= 20; i++) {
            // Если число делится на 3 без остатка, пропускаем его
            if (i % 3 == 0) {
                continue;
            }
            // Выводим число, не переходя на новую строку
            System.out.print(i + " ");

        }
    }
}