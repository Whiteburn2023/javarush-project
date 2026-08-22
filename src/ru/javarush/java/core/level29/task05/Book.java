package ru.javarush.java.core.level29.task05;

public class Book implements Comparable<Book>{

    private String bookTitle;
    private int publicationYear;

    public Book(String bookTitle, int publicationYear) {
        this.bookTitle = bookTitle;
        this.publicationYear = publicationYear;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public int compareTo(Book o) {
        int compare = Integer.compare(this.publicationYear, o.publicationYear);
        if (compare != 0) return compare;
        return this.bookTitle.compareTo(o.bookTitle);
    }
}
