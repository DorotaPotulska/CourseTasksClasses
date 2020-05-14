package JavaGda34.weekend5.zad13_strumienie;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/*      Tworzysz wyszukiwarkę sklepu internetowego.
        Wybierz przedmioty które są dla Ciebie interesujące
        (np. komputery, samochody, lustrzanki, smartfony, rowery, ubrania ...)
        • Zaimplementuj klasę która będzie modelować obiekt z minimum 6 właściwościami
        • Użyj kolekcji do przechowywania obiektów
        • Użyj strumieni, tak, aby użytkownik sam mógł zdefiniować kryteria wyszukiwania.*/

public class Main {
    public static void main(String[] args) {

        List<Ubrania> ubrania = Arrays.asList(
                new Ubrania("Baleriny",120.0,36,"skóra","czarny","buty"),
                new Ubrania("Baleriny",100.0,36,"skóra","czarny","buty"),
                new Ubrania("Dzinsy",100.0,42,"dżins","niebieski","spodnie"),
                new Ubrania("Baleriny",50.0,38,"bawełna","biały","bluzka"),
                new Ubrania("Ponczo",220,40,"wełna","czarny","sweter"),
                new Ubrania("Baleriny",120.0,36,"skóra","różowy","buty"),
                new Ubrania("Dzinsy",100.0,42,"dżins","niebieski","spodnie"),
                new Ubrania("Baleriny",50.0,38,"bawełna","biały","bluzka"),
                new Ubrania("Ponczo",220,40,"wełna","czarny","sweter"),
                new Ubrania("Baleriny",220.0,36,"skóra","czarny","buty"),
                new Ubrania("Dzinsy",100.0,42,"dżins","niebieski","spodnie"),
                new Ubrania("Baleriny",50.0,38,"bawełna","biały","bluzka"),
                new Ubrania("Ponczo",220,40,"wełna","czarny","sweter")
        );
        Ubrania kryteria =wyszukajUbranie();

        System.out.println(kryteria.toString());


        System.out.println("Wynik wyszukiwania: ");
        ubrania.stream()
                .filter(u->(u.cena<kryteria.cena))
                .filter(u->(u.kolor.equals(kryteria.kolor)))
                .filter(u->u.material.equals(kryteria.material))
                .filter(u->u.nazwa.equals(kryteria.nazwa))
                .filter(u->u.rozmiar==kryteria.rozmiar)
                .filter(u->u.typ.equals(kryteria.typ))
                .forEach(System.out::println);

    }

    private static Ubrania wyszukajUbranie() {

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj maksymalną cene ubrania");
        double cena = in.nextInt();
        System.out.println("Podaj rozmiar ubrania");
        int rozmiar = in.nextInt();
        in.nextLine();// w celu wywołania kolejnego zapytania
        // poniewaz po nextInt zostaje enter który jest przypisywany do kolejnego zapytania i przeskakuje dalej
        System.out.println("Podaj materiał ubrania");
        String material =in.nextLine();
        System.out.println("Podaj kolor ubrania");
        String kolor =in.nextLine();
        System.out.println("Podaj typ ubrania");
        String typ =in.nextLine();
        System.out.println("Podaj nazwe ubrania");
        String nazwa =in.nextLine();

        Ubrania wybor = new Ubrania(nazwa,cena,rozmiar,material,kolor,typ);

        return wybor;

    }
}
