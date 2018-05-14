//Stworzyć nową klasę arraysExample, stworzyć tablicę charów, wyświetlić czy tal liczba jest dużą literą czy małą

package com.sda.arrays;

public class ArraysExercise {
    public static void main(String[] args) {
        char[] charTable = {'A', 'a', 'B', 'b', 'C', 'c', 'D', 'd', 'E', 'e', '@'};

        for (int j = 0; j < charTable.length; j++) {
            boolean bigLetter = charTable[j] >= 65 && charTable[j] <= 90;
            boolean smallLetter = charTable[j] >= 'a' && charTable[j] <= 'z';

            if (bigLetter) {
                System.out.println(charTable[j] + " - Duża litera");
            } else if (smallLetter) {
                System.out.println(charTable[j] + " - Mała litera");
            } else {
                System.out.println(charTable[j] + " - To nie litera");
            }
        }
    }
}


/*
-----------------------------------------------------------------------
lepszym sposobem jest prównywanie samych liter, a nie kodów ASCII

    char [] letters = {'a', 'C', '2'};
    for (int i =0; i<3; i++) {
        if (letters[i] >= 'a' && letters[i] <= 'z') {
            System.out.println(letters[i] + " - jest mała litera);
            }
        }

inny zapis: (kolejny sposób refactoringu)

    char [] letters = {'a', 'C', '2'};
    for (int i =0; i<3; i++) {
        boolean smallLetter = letters[i] >= 'a' && letters[i] <= 'z';

        if (smallLetter) {
            System.out.println(letters[i] + " - jest mała litera);
            }
        }


-----------------------------------------------------------------------
*/


