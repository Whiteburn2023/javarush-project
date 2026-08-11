package ru.javarush.java.core.level26.task09;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем дженерик-коллекцию для хранения книг (каталог)
        // Добавляем две разные книги с разными названиями и авторами
        // Перебираем каталог и выводим название и автора каждой книги
        List<Book> list = new ArrayList<>();
        list.add(new Book("java", "eckel"));
        list.add(new Book("structure", "lafore"));

        for (Book book : list){
            System.out.println(book.getTitle() + " " + book.getAuthor());
        }

    }
}

// Отдельный класс, представляющий книгу: хранит название и автора
class Book {
    private final String title;
    private final String author;

    // Конструктор инициализирует поля книги
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Геттеры для доступа к полям
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}