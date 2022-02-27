package ru.skypro.lesson9;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Book firstBook = new Book("Война и мир", new Author("Лев", "Толстой"), 1865);
        firstBook.setAge(1869);
        Book secondBook = new Book("Капитанская дочка", new Author("Александр", "Пушкин"), 1836);
        System.out.println("Первая книга: " + firstBook.getBookName() + "; " + firstBook.getAuthor() + "; " + firstBook.getAge());
        System.out.println("Вторая книга: " + secondBook.getBookName() + "; " + secondBook.getAuthor() + "; " + secondBook.getAge());

    }
}
