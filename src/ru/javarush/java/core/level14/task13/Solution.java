package ru.javarush.java.core.level14.task13;

public class Solution {
    public static void main(String[] args) {
        // Регистрируем книгу, у которой пока есть только название
        // Регистрируем книгу с названием и количеством страниц
        // Выводим значения полей для обеих книг (по очереди: название, затем количество страниц)
        Book book1 = new Book("Загадочный роман");
        Book book2 = new Book("Путешествие по космосу", 500);

        System.out.println(book1.getBookTitle());
        System.out.println(book1.getPageCount());
        System.out.println(book2.getBookTitle());
        System.out.println(book2.getPageCount());

    }
}

// "Форма" для книги: хранит название и количество страниц

class Book{
    private String bookTitle;
    private int pageCount;

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
        this.pageCount = 0;
    }

    public Book(String bookTitle, int pageCount) {
        this.bookTitle = bookTitle;
        this.pageCount = pageCount;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }
}
