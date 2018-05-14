package com.sda.arrays;

import java.io.File;

public class ArraysExample {
    public static void main(String[] args) {
        int size = 10;
        int[] numbers = {1, 2, 22, 102};
        int[] otherNumber = new int[size];

        ArraysExample[] some = new ArraysExample[10];
        String[] stringArray = new String[10];
        Integer[] some2 = new Integer[10];
        File[] some3 = new File[10];

        stringArray[5] = "name";
        stringArray[4] = "name2";
        numbers[3] = 500;
        System.out.println(stringArray[4] + ", " + stringArray[5]);

        for (int i = 0; i < size; i++) {
            System.out.println(otherNumber[i]);
        }

        String[] names = {"Paweł", "Jan", "Kuba"};
        for (String n : names) {
            System.out.println(n);
        }
    }
}

