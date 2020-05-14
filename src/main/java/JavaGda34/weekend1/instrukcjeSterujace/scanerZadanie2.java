package JavaGda34.weekend1.instrukcjeSterujace;

import java.util.Scanner;

public class scanerZadanie2 {
    public static void main(String[] args) {
        int liczba1;
        int liczba2;
        float wynik;

        System.out.println("Podaj dwie liczby do obliczenia dzielenia pierwszej przez drugą.");
        System.out.println("Pierwsza liczba:");
        Scanner podanaLiczba1= new Scanner(System.in);
        liczba1=podanaLiczba1.nextInt();
        System.out.println("Druga liczba:");
        Scanner podanaLiczba2 = new Scanner(System.in);
        liczba2=podanaLiczba2.nextInt();

        if(liczba2!=0){
            wynik=(float)liczba1/liczba2;
            System.out.println("Wynik z dzielenia "+wynik);
        }else{
            System.out.println("Druga liczba nie może być zerem");
        }
    }
}
