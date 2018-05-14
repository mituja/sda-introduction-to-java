// w petli for 0 do 100 wyswietlic czy jest za czy przed polowa
// wyświetlić tylko liczby parzyste
// każdą pętli for przepisać na while i do while

package com.sda.loops;

public class LoopsExercise {
    public static void main(String[] args) {

//        for (int i = 0; i < 100; i++) {
//            System.out.println(i < 50 ? "Przed połową" : "Za połową");
//        }
//
//        for (int i = 0; i < 100; i = i + 2) {
//            System.out.println("Liczba parzysta 1 " + i);
//        }
//
//        for (int i = 0; i < 100; i++) {
//            if (i % 2 == 0)
//                System.out.println("Liczba parzysta 2 " + i);
//        }
//
//        int i = 0;
//        while (i < 100) {
//            System.out.println("Pętla while " + i);
//            i++;
//        }
//
//        int j = 0;
//        do {
//            System.out.println("Pętla do while " + j);
//            j++;
//        } while (j < 100);

//        int i = 0;
//        while (i < 100) {
//            System.out.println(i < 50 ? "Przed połową 1" : "Za połową 1");
//            i++;
//        }
//
//        int j = 0;
//        do {
//            System.out.println(j < 50 ? "Przed połową 2" : "Za połową 2");
//            j++;
//        } while (j < 100);

//        int i = 2;
//        while (i < 100) {
//            System.out.println(i);
//            i = i + 2;
//        }

//        int j = 2;
//        do {
//            System.out.println(j);
//            j = j + 2;
//        } while (j<100);

//        int i = 0;
//        while (i<100) {
//            if (i%2 == 0) {
//                System.out.println(i);
//                i++;
//            }
//            else {
//                i++;
//            }
//        }

        int j = 0;
        do {
            if (j % 2 == 0) {
                System.out.println(j);
                j++;
            } else {
                j++;
            }
        } while (j < 100);

    }
}

