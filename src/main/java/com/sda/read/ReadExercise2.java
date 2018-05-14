//program pyta o litere i w locie sprawdza czy jest mała czy duża

package com.sda.read;

import java.util.Scanner;

public class ReadExercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exitCommand = "exit";

        while (true) {
            System.out.println("Podaj litere:");

            String input = sc.next();
            if (input.equalsIgnoreCase(exitCommand)) {
                break;
            }

            char fromUser = input.charAt(0);

            if (fromUser >= 'a' && fromUser <= 'z') {
                System.out.println("Mała litera");
            } else {
                System.out.println("Duża litera");
            }
        }
        System.out.println("Good bye!");
    }
}

/* rozwiązanie zrefaktoryzowane

    Scanner sc = new Scanner(System.in);
    String exitCommand = "exit";
    boolean shouldAskAgain = true;

        while (shouldAskAgain) {
                System.out.println("Podaj litere");

                String input = sc.next();
                if(input.equalsIgnoreCase(exitCommand))
                shouldAskAgain = false;

                char fromUser = input.charAt(0);

                if(fromUser >='a' && fromUser <='z')
                System.out.println("mala litera");
                else
                System.out.println("nie mala litera");
                }
                System.out.println("Good bye!");

 */

/* inne rozwązanie z do-while

    Scanner sc = new Scanner(System.in);
    String exitCommand = "exit";
    String input;
        do {
                System.out.println("Podaj litere");
                input = sc.next();
                char fromUser = input.charAt(0);

                if (fromUser >= 'a' && fromUser <= 'z')
                System.out.println("mala litera");
                else
                System.out.println("nie mala litera");
                } while (!input.equalsIgnoreCase(exitCommand));

                System.out.println("Good bye!");
                c
 */

