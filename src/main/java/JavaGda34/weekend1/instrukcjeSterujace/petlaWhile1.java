package JavaGda34.weekend1.instrukcjeSterujace;

import java.util.Scanner;

public class petlaWhile1 {
    public static void main(String[] args) {
        //deklaracja na poczatku zeby nie tracic pamieci i nie tracac kolejnej pamieci przy wpisywaniu kolejnych liczb
        //a tak dzieki temu bedzie nadpisywane

        int liczba;
        Scanner podanaLiczba=new Scanner(System.in);
        //rozwiazanie 1
       /* while (true){
            System.out.println("Podaj liczbę: ");
            liczba=podanaLiczba.nextInt();
            if(liczba==666){
                break;
            }
        }*/

       //rozwiazanie 2
        liczba = 1;

        while (liczba!=666){
            System.out.println("Podaj liczbę: ");
            liczba=podanaLiczba.nextInt();

        }
    }
}
