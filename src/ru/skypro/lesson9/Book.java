package ru.skypro.lesson9;

import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    private int age;

    public Book (String bookName, Author author, int age) {
        this.bookName = bookName;
        this.author = author;
        this.age = age;
    }
    public String getBookName () {
        return this.bookName;
    }
    public Author getAuthor () {
        return this.author;
    }
    public int getAge () {
        return this.age;
    }
    public void setAge (int age) {
        this.age = age;
    }

    //Домашнее задание №10
    public String toString () {
        return "Название: " + this.bookName + "; Автор: " + this.author + "; Год: " + this.age;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return age == book.age && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }
    public int hashCode() {
        return Objects.hash(bookName, author, age);
    }
}


