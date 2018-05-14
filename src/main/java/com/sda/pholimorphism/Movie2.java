package com.sda.pholimorphism;

public class Movie2 {
    private String title;
    private String author;

    public Movie2 setAuthor(String author) {
        this.author = author;
        return this;
    }

    public Movie2 setTitle(String title) {
        this.title = title;
        return this;
    }

    public static void main(String[] args) {
        Movie2 m = new Movie2().setAuthor("").setTitle("");
    }

}

