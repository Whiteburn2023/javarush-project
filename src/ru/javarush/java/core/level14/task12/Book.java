package ru.javarush.java.core.level14.task12;

public class Book{
    private String bookTitle;
    private int numberOfPages;

    public Book() {
        this.bookTitle = "Без названия";
        this.numberOfPages = 0;
    }

    public Book(String bookTitle, int numberOfPages) {
        this.bookTitle = bookTitle;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Книга: " + bookTitle + ", страниц: " + numberOfPages;
    }
}
