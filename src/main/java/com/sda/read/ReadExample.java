package com.sda.read;

import java.util.Scanner;

public class ReadExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // lub też InputStream keyboard = System.in;
        // Scanner scanner = new Scanner(keyboard);
        // Nie zapomnieć o bibliotece import java.io.InputStream;

        String userInput = scanner.nextLine();
        System.out.println(userInput);

        System.out.println("Czy znasz Jave?");
        boolean knowsJava = scanner.nextBoolean();
        if(knowsJava){
            System.out.println("User zna Jave");
        }
        else {
            System.out.println("User nie zna Javy");
        }


    }
}
