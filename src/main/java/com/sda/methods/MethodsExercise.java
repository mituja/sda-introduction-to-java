package com.sda.methods;

public class MethodsExercise {
    public static void main(String[] args) {
        int[] number = {1, 1, 7};

        for (int i = 0; i < number.length - 1; i++) {
            if (number[i] != number[i + 1]) {
                swap(number, i, i + 1);
                break; // potrzebna jest zamiana tylko jednej pary, nie całej tablicy
            }
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
        }
    }

    private static void swap(int[] array, int srcPos, int destPos) {
        int temp = array[srcPos];
        array[srcPos] = array[destPos];
        array[destPos] = temp;
    }


    ////

//    private static void itterateAndSwap(int[] number) {
//        for (int i = 0; i < number.length; i++) {
//            if (number[i] > number[i + 1]) {
//                swaper(number,i, i + 1);
//                break;
//            }
//            printArray(number);
//        }
//    }

    private static void printArray(int[] number) {

    }

//    private static void swaper(int[] array, int source, int dest) {
//        int[] array;
//        int temp = array[source];
//        array[source] = array[dest];
//        array[dest] = temp;
//    }

//    public static void findOtherNumberWithSameDigits (int[] number){
//        itterateAndSwap(new int[] {1,2,3});
//    }


}
