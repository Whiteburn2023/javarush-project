package ru.javarush.java.core.level11.task12;

public class Solution {

    // Метод для проверки имени пользователя
    public static void validateUserName(String userName) {
        // Проверяем, является ли имя пользователя пустым
        // Генерируем исключение IllegalArgumentException с заданным сообщением
        // Сообщение, которое выводится всегда, независимо от результата проверки
        try {
            if (userName.equals("")) {
                throw new IllegalArgumentException("Регистрация отклонена: Имя пользователя не может быть пустым.");
            }
        } finally {
            System.out.println("Проверка имени пользователя завершена.");
        }
    }

    public static void main(String[] args) {
        // Вызываем метод validateUserName с пустой строкой
        // Перехватываем исключение и выводим его сообщение
        try {
            validateUserName("");

        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}