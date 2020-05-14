package JavaGda34.weekend4.kolekcje.zad3_sety_DOKOŃCZYC;

import java.util.*;

/*1. Napisz program do losowania gry w lotto przy pomocy Seta
        1. Utwórz Klasę LottoGra
        2. Dodaj metodę zagraj():void, która najpierw odpyta użytkownika o 6
        liczb w zakresie 1-49 i zapisze wynik w postaci Setu
        3. Następnie wywoła metodę prywatną przeprowadzLosowanie():Set<Integer>,
        która zwróci 6 losowo wybranych liczb
        4. Ostatecznie prześle oba sety do metody zwrocWynik(Set, Set):int która przekaże
        ilość trafionych liczb
        5. Na koniec wydrukuje wiadomość podsumowującą
        tj. jakie liczby obstawił użytkownik a jakie wygenerował komputer oraz liczbę trafień użytkownika*/
public class LottoGra {
    public static void main(String[] args) {
        zagraj();


    }

    public static void zagraj() {
        Set<Integer> podaneLiczby = new TreeSet<>();

        Scanner in = new Scanner(System.in);
        int liczba;
        int i = 0;
        do {

            System.out.println("Podaj " + (i + 1) + " liczbe");
            liczba = in.nextInt();
            if (liczba > 0 && liczba < 50) {
                if (!podaneLiczby.contains(liczba)) {
                    podaneLiczby.add(liczba);
                    i++;
                } else {
                    System.out.println("Liczba została podana wcześniej");
                }
            } else {
                System.out.println("Liczba wykracza zakres 1-49");
            }

        } while (i < 6);
        System.out.println("Podane liczby to:");
        System.out.println(podaneLiczby);
        System.out.println("Losowanie");
        TreeSet<Integer> wylosowane = przprowadzLosowanie();
        System.out.println("Wylosowane liczby to");
        System.out.println(wylosowane);
        zwrocWynik((TreeSet) podaneLiczby, wylosowane);
    }

    private static TreeSet<Integer> przprowadzLosowanie() {
        Set<Integer> wylosowane = new TreeSet<>();
        int liczba;
        Random rd = new Random();
        do {
            liczba = rd.nextInt(49) + 1;
            wylosowane.add(liczba);
        } while (wylosowane.size() < 6);
        return (TreeSet<Integer>) wylosowane;

    }

    public static int zwrocWynik(Set<Integer> podaneLiczby, Set<Integer> wylosowane) {
        int ilosc;
        Set<Integer> trafione = new TreeSet();
        for (Integer x:podaneLiczby) {
            for (Integer y:wylosowane) {
                if (x == y) {
                    trafione.add(x);

                }
            }
        }

        ilosc=trafione.size();
        System.out.println("Ilośc trafionych liczb");
        System.out.println(ilosc);
        return ilosc;
    }

}
