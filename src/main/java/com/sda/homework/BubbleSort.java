package com.sda.homework;

public class BubbleSort {
    public static void main(String[] args) {

        int[] numbers = {4, 3, 1, 6, 2};
        int noMove = 0;

        while (noMove < (numbers.length) - 1) {

            noMove = 0;

            for (int i = 0; i < (numbers.length - 1); i++) {

                if (numbers[i] > numbers[i + 1]) {
                    int newMax = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = newMax;
                } else {
                    noMove++;
                }

                System.out.println("\n i: " + i + ", noMove: " + noMove + " Tablica: ");

                for (int n : numbers) {
                    System.out.print(n);
                }
            }

        }

    }

}

