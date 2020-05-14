package JavaGda34.weekend2.metody;

import java.util.Scanner;

/*1. Napisz program, który sprawdza czy liczba podana przez użytkownika jest podzielna przez 3 lub 5.
        2. * Napisz program który pozwala użytkownikowi samemu zdecydować podzielność przez jaką liczbę będzie badana*/
public class zad7_metody {
    public static void main(String[] args) {

        int liczba=pobierzLiczbe();

        System.out.println("Dzielnik");
        int dzielnik=pobierzLiczbe();

        czyPodzielnaPrzez3i5(liczba);
        System.out.println("Czy podzielna przez 3 i 5");
        System.out.println(czyPodzielnaPrzez3i5(liczba));

        czyPodzielnaPrzezDzielnik(liczba,dzielnik);
        System.out.println("Czy podzielna przez dzielnik");
        System.out.println(czyPodzielnaPrzezDzielnik(liczba,dzielnik));
    }

    public static int pobierzLiczbe(){
        int liczba;
        Scanner in=new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        liczba=in.nextInt();
        return liczba;
    }

    public static boolean czyPodzielnaPrzez3i5(int liczba){
        return (liczba%3==0 && liczba%5==0);

    }

    public static boolean czyPodzielnaPrzezDzielnik(int liczba, int dzielnik){
        return liczba%dzielnik==0;
    }
}
