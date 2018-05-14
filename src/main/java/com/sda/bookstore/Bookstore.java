package com.sda.bookstore;

import java.util.Scanner;

public class Bookstore {

//        String author;
//        String title;
//        int price;
//        int amount;

//        Book book = new Book(author, title, price, amount);

    public static String printBook(Book book) {
        return ("Autor: " + book.getAuthor() + "; Tytuł: " + book.getTitle() + "; Cena: " + book.getPrice() + "; Ilość na stanie: " + book.getAmount());
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj imię autora: ");
        String firstName = input.nextLine();
        System.out.println("Podaj nazwisko autora: ");
        String lastName = input.nextLine();
        System.out.println("Podaj tutuł: ");
        String title = input.nextLine();
        System.out.println("Podaj cene: ");
        int price = input.nextInt();
        System.out.println("Podaj ilość: ");
        int amount = input.nextInt();

        Book newBook = new Book(firstName, lastName, title, price, amount);
        System.out.println(printBook(newBook));
    }

}


