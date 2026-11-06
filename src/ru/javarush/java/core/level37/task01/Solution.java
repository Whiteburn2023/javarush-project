package ru.javarush.java.core.level37.task01;

import java.nio.charset.StandardCharsets;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Сообщение, которое нужно закодировать
        String secretMessage = "Привет";

        // Преобразуем строку в массив байтов в кодировке UTF-8
        byte[] encodedBytes = secretMessage.getBytes(StandardCharsets.UTF_8);


        // Выводим каждый байт на новой строке
        for (int i = 0; i < encodedBytes.length; i++) {
            System.out.println(encodedBytes[i]);
        }


    }
}