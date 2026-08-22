package ru.javarush.java.core.level29.task03;

import java.util.Objects;

public class Book {
    private String bookTitle;
    private String bookAuthor;

    public Book(String bookTitle, String bookAuthor) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, bookAuthor);
    }
}
