package ru.javarush.java.core.level10.task17;

import javax.xml.transform.Source;

public class Solution {
    public static void main(String[] args) {
        // Числовой код HTTP-статуса
        int httpStatusCode = 200;
        // Новый синтаксис switch-выражения:
        // Вывод результата на экран

        String responseMessage = switch (httpStatusCode){
            case 200 -> "OK";
            case 400, 404 -> "Ошибка клиента";
            case 500 -> "Ошибка сервера";
            default -> "Неизвестный код";
        };
        System.out.println(responseMessage);


    }
}