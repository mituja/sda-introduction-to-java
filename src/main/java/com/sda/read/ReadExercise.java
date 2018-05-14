//program pyta ile znaków, stworzyc taka tablica, w petli pytac o znaki, jak poda wszystkie to wyswietlic analogicznie

package com.sda.read;

import java.util.Scanner;

public class ReadExercise {
    public static void main(String[] args) {

        System.out.println("Podaj wielkość tablicy znaków: ");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        System.out.println("Wielkość twojej tablicy to " + arraySize);

        char[] userArray = new char[arraySize];

        for (int i = 0; i < userArray.length; i++) {
            System.out.println("Podaj znak: ");
            String userInput = scanner.next();

            if (userInput.length() > 1) {
                System.out.println("Podałeś zbyt wiele znaków ");
                i--;
            } else {
                char userLetter = userInput.charAt(0);
                userArray[i] = userLetter;
            }

        }

        for (int i = 0; i < arraySize; i++) {
            boolean bigLetter = userArray[i] >= 'A' && userArray[i] <= 'Z';
            boolean smallLetter = userArray[i] >= 'a' && userArray[i] <= 'z';

            if (bigLetter) {
                System.out.println(userArray[i] + " - Duża litera");
            } else if (smallLetter) {
                System.out.println(userArray[i] + " - Mała litera");
            } else {
                System.out.println(userArray[i] + " - To nie litera");
            }
        }

    }
}
