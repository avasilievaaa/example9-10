package ru.skypro.lesson9;

public class Author {
    String name;
    String surname;

    public Author (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName () {
        return this.name;
    }
    public String getSurname () {
        return this.surname;
    }
    public String toString () {
        return this.name + " " + this.surname;
    }
}
