package com.sda.homework;

public class Exercise3 {
    public static void main (String[] args) {
        int[] numbers = {1,1,3,4,4,6,7,8,1,1};

        for (int i =0; i < (numbers.length - 1); i++){

            int j = i + 1;

            if (numbers[i] == numbers[j]) {
                System.out.println(numbers[i] + ", ");
                i++;
            }
        }
    }
}
