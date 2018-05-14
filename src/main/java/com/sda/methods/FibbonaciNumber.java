//Algorytm ma wyświetlić liczbę z ciągu po podaniu numeru iteracji

package com.sda.methods;

public class FibbonaciNumber {

    public static void main(String[] args) {
        long beforeInvocation = System.currentTimeMillis();

        System.out.println("gFV: " + getFibbonaciValue(6));
        long timeAfterInvocation = System.currentTimeMillis();
        System.out.println("Time: " + (timeAfterInvocation - beforeInvocation));

        System.out.println("gFR: " + getFibbonacciRecursive(6));
    }

    public static int getFibbonaciValue(int whichElement) {

        int first = 0;
        int second = 1;
        int temp;

        for (int i = 2; i < whichElement; i++) {
            temp = second;
            second = second + first;
            first = temp;
        }

        return second;
    }

    private static int getFibbonacciRecursive(int whichElement) {
        if (whichElement == 0)
            return 0;
        if (whichElement == 1)
            return 1;

        return (getFibbonacciRecursive(whichElement - 1) + getFibbonacciRecursive(whichElement - 2));

    }
}
