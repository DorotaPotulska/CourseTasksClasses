package JavaGda34.weekend1.instrukcjeSterujace;

import java.util.Scanner;

public class petlaFor3 {
    public static void main(String[] args) {
        int dzielnik;
        int liczba;

        System.out.println("Podaj liczbę:");
        Scanner podanaLiczba=new Scanner(System.in);
        liczba=podanaLiczba.nextInt();


        System.out.println("Podaj dzielnik:");
        Scanner podanyDzielnik=new Scanner(System.in);
        dzielnik=podanyDzielnik.nextInt();


        for(int i=0;i<liczba;i++){
            if(i%dzielnik==0){
                System.out.println("Liczba mniejsza od "+liczba+" i podzelna przez "+dzielnik+" to " +i);
            }

        }

    }

}
