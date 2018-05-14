package com.sda.classes;

public class User {
    private String name;
    private String surname;
    private String pesel;
    private Status state = Status.DISABLED; //tak się korzysta z enuma
    private int age;

    public String getFullName() {
        return name + "" + surname;
    }

    public User(String pesel){
        this.pesel = pesel;
        this.state = state;
    }

    public User(String pesel, String name, String surname) {
        this.pesel = pesel;
        this.name = name;
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setAge(int age) {
        if (age <= 0) {
            age = 0;
        } else {
            this.age = age;
        }
    }
}
