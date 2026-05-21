package ru.javarush.java.core.level62.task08;

import java.lang.reflect.Constructor;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Получаем объект Class для класса Book

        Class<Book> aClass = Book.class;
        Constructor<Book> constructor = aClass.getConstructor(String.class, int.class);
        Book book = constructor.newInstance("Загадки Программирования", 750);


        // Получаем конструктор с параметрами (String, int) через рефлексию
        // Создаем новый объект Book, применяя "заклинание" конструктора
        // Выводим название и количество страниц с помощью геттеров
        System.out.println(book.getTitle());
        System.out.println(book.getPages());
    }
}