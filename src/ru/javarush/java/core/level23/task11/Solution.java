package ru.javarush.java.core.level23.task11;

// Класс, описывающий пользователя
class User {
    // Приватное строковое поле: доступно только внутри класса User
    private String userPassword;
}

// Сервис для работы с пользователями
class UserService {
    public static void main(String[] args) {
        // Создаем объект пользователя
        User user = new User();
//        user.userPassword = "12345";


        // Попытка напрямую присвоить значение приватному полю из другого класса:

    }
}