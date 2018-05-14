// dla zadanej tablicy intow wydrukowac liczbe w formie int, ktora jest inna

package com.sda.arrays;

public class ArraysExercise2 {
    public static void main(String[] args) {
        int[] number = {1, 1, 7};

        for (int i = 0; i < number.length-1; i++) {
            if (number[i] != number[i + 1]) {
                int temp = number[i];
                number[i] = number[i + 1];
                number[i + 1] = temp;
                break; // potrzebna jest zamiana tylko jednej pary, nie całej tablicy
            }
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
        }
    }


}
