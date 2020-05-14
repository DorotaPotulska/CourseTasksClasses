package JavaGda34.weekend1.instrukcjeSterujace;

import java.util.Scanner;

public class petlaFor2 {
    public static void main(String[] args) {

        int liczba;
        System.out.println("Podaj liczbę:");
        Scanner podanaLiczba = new Scanner(System.in);
        liczba = podanaLiczba.nextInt();

        for (int i = -liczba; i < liczba; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("Liczba podzielna przez 3 i 7 to:" + i);

            }
        }

    }
}
