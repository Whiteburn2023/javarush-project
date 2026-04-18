package ru.javarush.java.core.level05.task03;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String magicMessage = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(magicMessage);
        magicMessage = stringBuilder.reverse().toString();
        for (int i = 0; i < magicMessage.length(); i++) {

        }
        System.out.println(magicMessage);

        // Просим пользователя ввести строку (послание)


        // Разворачиваем строку с помощью цикла for


        // Выводим инвертированную строку

    }
}