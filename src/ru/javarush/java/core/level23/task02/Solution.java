package ru.javarush.java.core.level23.task02;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную ссылочного типа Book

        Book libraryBook = null;



        // Пытаемся обратиться к методу у null-ссылки.
        // Во время выполнения это приведет к NullPointerException.
        System.out.println(libraryBook.getTitle());

    }
}