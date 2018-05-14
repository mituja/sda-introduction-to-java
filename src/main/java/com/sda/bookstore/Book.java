//*LATWE* Zaprojektujcie klasę reprezentującą ksiązke.
// Taka ksiązka powinna miec tytul, autora, cene, moze ilosc w magazynie:).
// fajnie by bylo jakby klasa ksiazka pozwalala na wyswietlenie/pobranie tych danych.
// ich ustawianie proponuje zrobic w konstruktorze. proponuje zrobic kilka konstruktorow.
// ale prosze Was niech one beda sensowne biznesowo :slightly_smiling_face:
// Tak zeby klasa wystawiala jasny kontrakt kiedy jej utworzenie jest poprawn

package com.sda.bookstore;

public class Book {
    private Author author;
    private String title;
    private int price;
    private int amount;

    public Book(String firstName, String lastName, String title, int price, int amount) {
        this.author = new Author(firstName, lastName);
        this.title = title;
        this.price = price;
        this.amount = amount;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }
}
