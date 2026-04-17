package ru.javarush.java.core.level14.task03;

public class Book {
    String title;
    int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    void printInfo() {
        System.out.println("Название: " + title + ", страниц: " + pages);
    }
}