package com.sda.loops;

public class LoopsMain {
    public static void main(String[] args) {
        for (int i = 0, j = 3; i < 100 && j < 153; i++, j = j + 3) {
            System.out.println("Pętla   i " + i + " j " + j);
        }

    }
}

