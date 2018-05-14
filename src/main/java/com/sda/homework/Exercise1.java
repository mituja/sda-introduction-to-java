//Majac na wejsciu liczbę zapianą jako tablica `int`, tzn np liczba `123` będzie zapisana jako
// `int[] number = new int[] {1, 2, 3}` chcialbym zeby Wasz program wypisal na ekranie inna liczbę
// ale składająca się z tych samych cyfr. tzn dla liczby `123` moze to byc `213`.
// Do tego zadania kilka utrudnien
// *A* - Wyswietlona liczba musi byc dowolnie wiekszą od liczby wejsciowej.
// *B* - liczba musi byc kolejną wiekszą liczbą, czyli np dla 123 musi to byc 132.
// *C* - liczba bedzie zadania nie jako tablica, a jako int, tzn `int number = 845`

package com.sda.homework;

public class Exercise1 {
    public static void main(String[] args) {
        variantA();
        variantB();
        variantC();

    }

    public static void variantA() {

        System.out.println("\n ___Wykonuje wariant A___");

        int[] number = new int[]{1, 2, 3};
        System.out.println("Twoja liczba to ");
        for (int i : number) {
            System.out.print(i);
        }

        for (int i = 0; i < number.length;  i++) {
            if (number[i]  != number[i + 1] && number[i] < number[i + 1]) {
                int temp = number[i];
                number[i] = number[i + 1];
                number[i + 1] = temp;
                break;
            }

        }

        System.out.println("\n Nowa liczba to ");

        for (int j : number) {
            System.out.print(j);
        }

    }

    public static void variantB() {

        System.out.println("\n ___Wykonuje wariant B___");

        int[] number = new int[]{1, 2, 3};
        System.out.println("Twoja liczba to ");
        for (int i : number) {
            System.out.print(i);
        }

        int i = number.length - 1;

        while (i >= 0) {
            if (number[i] != number[i - 1] && number[i] > number[i-1] ) {
                int temp = number[i];
                number[i] = number[i - 1];
                number[i - 1] = temp;
                break;
            }
            i--;

        }

        System.out.println("\n Nowa liczba to ");

        for (int j : number) {
            System.out.print(j);
        }
    }

    public static void variantC(){

        System.out.println("\n ___Wykonuje wariant C___");

        int number = 592;
        int[] digits = new int[3];

        digits[0] = number / 100;
        digits[1] = (number / 10)%10;
        digits[2] = number % 10;

        System.out.println("Twoja liczba to: ");
        for(int i : digits){
            System.out.print(i);
        }

        for (int i = 0; i < digits.length;  i++) {
            if (digits[i]  != digits[i + 1] && digits[i] < digits[i + 1]) {
                int temp = digits[i];
                digits[i] = digits[i + 1];
                digits[i + 1] = temp;
                break;
            }

        }

        System.out.println("\n Nowa liczba to ");

        for (int i : digits) {
            System.out.print(i);
        }


    }
}



