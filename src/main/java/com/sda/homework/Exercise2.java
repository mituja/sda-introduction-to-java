// Chemy zbudowac linie z klockow. Mamy do dyspozycji male klocki (1 metr) i duze klocki (5 metrow. ).
// Program powinien odpowiadać na pytanie czy z dostepnych klockow da sie zbudowac linie.
// Np. Mamy 3 kolcki o dlygosci 5m i 3 klocki o dlugosci 1m. Czy da sie z nich zbudowac linie o dlugosci 4m ?
// odpowiedz brzmi *NIE* bo mozemy ulozyc 3*1m to jest 3 metry lub 1* 5m czyli 5m. 4m nam sie nie uda

//Podziel odcinek przez krótszy klocek
//        - jeżeli wynik jest mniejszy lub równy min. ilości tych klocków, odpowiedz TAK
//        - jeżeli wynik jest większy, sprawdź dzielenie kolejnego klocka
//
//        Podziel odcinek przez dluższy klocek
//        - jeżeli wynik jest mniejszy lub rowny min. ilości tych klocków, to sprawdź modulo z dzielenia
//              - jeśli jest mniejsze lub równe min. ilości, odpowiedz TAK
//              - jeśli jest większe od min. ilości, odpowiedz NIE
//        - jeżeli wynik jest większy od ilości tych klocków, to odpowiedź NIE

package com.sda.homework;

import java.util.Scanner;

public class Exercise2 {

    public static void main (String[] args){
        while(true){
            line();
        }
    }

    public static void line() {

        int smallBlock = 1;
        int smallQuantity = 3;
        int bigBlock = 5;
        int bigQuantity = 2;

        System.out.println("Podaj długość linii");
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();
        System.out.println("Twoja linia ma długość " + line + " jednostek");

        if (line / smallBlock <= smallQuantity) {
            System.out.println("TAK!");
        }
        else if (line / bigBlock <= bigQuantity) {
            if (line%bigBlock <= smallQuantity) {
                System.out.println("TAK!");
            } else {
                System.out.println("NIE!");
            }

        }

        else if (line / bigBlock > bigQuantity) {
            System.out.println("NIE!");
        }

        }
}
