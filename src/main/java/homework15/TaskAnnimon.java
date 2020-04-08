package main.java.homework15;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Task Annimon. Read the file with the book names located in the books
 * folder (the project root), deserialize it to the list of book objects,
 * and then group the books by author.
 */

public class TaskAnnimon {
    public static void main(String[] args) {
        File file = new File(".\\books.txt");
        List<Book> bookList = new ArrayList<>();
        List<Book> books = new ArrayList<>();
        books.add(new Book("Л.Толстой", "Война и мир"));
        books.add(new Book("Л.Толстой", "Анна Каренина"));
        books.add(new Book("Ф.Достоевский", "Идиот"));
        books.add(new Book("Ф.Достоевский", "Братья Карамазовы"));
        books.add(new Book("Н.Гоголь", "Мертвые души"));
        books.add(new Book("Н.Гоголь", "Ревизор"));
        books.add(new Book("Дж.Оруэлл", "1984"));
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (Book book : books) {
                objectOutputStream.writeObject(book);
            }
            objectOutputStream.close();
        } catch (IOException ex) {
            System.out.println("File is not created");
        }
        FileInputStream fileInputStream = null;
        ObjectInputStream inputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            inputStream = new ObjectInputStream(fileInputStream);
            while (true) {
                try {
                    bookList.add((Book) inputStream.readObject());
                } catch (EOFException e) {
                    break;
                }
            }
            inputStream.close();
        } catch (IOException ex) {
            System.out.println("Could not read file");
        } catch (ClassNotFoundException ex) {
            System.out.println("Could not find file");
        }
        bookList.stream().collect(Collectors.groupingBy(Book::getAuthor))
                .forEach((a, b) -> System.out.println(a + ": " + b.toString()));
    }
}

