package com.sda.arrays;

public class ArraysExercise3 {
    public static void main(String[] args) {

        //int[] digits = {1,2,3,4,5,6};
        int[] digits = new int[100];
        for (int i = 0; i < 100; i++) {
            digits[i] = i;
        }


        for (int digit : digits) {
            if (digit % 2 == 0) {
                System.out.println(digit);
            }
        }

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Liczba parzysta " + i);
            }
        }
    }
}
