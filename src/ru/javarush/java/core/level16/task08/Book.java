package ru.javarush.java.core.level16.task08;

public class Book {
    private String bookTitle;
    private int pageCount;

    private Book(Builder builder) {
        this.bookTitle = builder.bookTitle;
        this.pageCount = builder.pageCount;
    }

    @Override
    public String toString() {
        return "Book: " + bookTitle + ", " + pageCount + " pages.";
    }

    public static class Builder{
        private String bookTitle;
        private int pageCount;

        public Builder setTitle(String title){
            this.bookTitle = title;
            return this;
        }

        public Builder setPages(int pages){
            this.pageCount = pages;
            return this;
        }

        public Book build(){
            return new Book(this);
        }
    }
}
