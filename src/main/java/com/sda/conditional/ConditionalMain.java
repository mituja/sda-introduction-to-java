package com.sda.conditional;

public class ConditionalMain {
    public static void main(String[] args) {

        boolean twoGreaterThanThree = 2 > 3;
        if (twoGreaterThanThree) {
            System.out.println("dwa wieksze niz trzy");
        } else {
            System.out.println("dwa mniejsze niz trzy");
        }

        int two = 2;
        int three = 3;

        System.out.println(two > three ? "wieksze" : "mniejsze");
    }
}
