package main.java.homework15;

import java.io.Serializable;

public class Book implements Serializable {
    private String author;
    private String book;

    public Book(String author, String book) {
        this.author = author;
        this.book = book;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return " book: " + book;
    }
}
