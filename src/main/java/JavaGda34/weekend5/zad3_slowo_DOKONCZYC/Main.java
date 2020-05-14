package JavaGda34.weekend5.zad3_slowo_DOKONCZYC;

import java.util.*;

/*      1. Napisz program do zliczania wystąpień słów w tekście, w tym celu:
        2. Dodaj metodę zliczWystapieniaSlow(String tekst):Map<String, Integer>
            1. Metoda pobiera tekst
            2. Następnie rozdziela go na wystąpienia słów
            3. Tworzy mapę ‚słowo’  ilość wystąpień
            4. Iteruje po wszystkich słowach w zadanym tekscie
            5. Dla każdego słowa wyciąga ilość zliczonych słów z mapy i dorzuca kolejne wystąpienie
        3. Program wyświetla wszystkie odkryte słowa wraz z ich liczebnością
        4. * Program wyświetla wszystkie odkryte słowa wraz z ich liczebnością w kolejności od najczęściej
        występującego do najrzadziej występującego*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> mapa = new HashMap<>();
        System.out.println("Podaj tekst: ");
        String tekst = in.nextLine();

        mapa=zliczWystapieniaSlow(tekst);
        System.out.println(zliczWystapieniaSlow(tekst));

        Collection<Integer> listaIntow = new ArrayList<>();
        listaIntow = mapa.values();

        System.out.println(listaIntow);

        listaIntow.toArray();

    }

    private static Map<String, Integer> zliczWystapieniaSlow(String tekst) {
        String[] slowa = tekst.split(" ");
        Map<String, Integer> mapaSlow = new HashMap<>();

        for (int i = 0; i < slowa.length; i++) {
            if (mapaSlow.containsKey(slowa[i])==false) {
                mapaSlow.put(slowa[i], 1);
            } else if (mapaSlow.containsKey(slowa[i]) == true) {
                mapaSlow.put(slowa[i], mapaSlow.get(slowa[i]) + 1);
            }
        }

        return mapaSlow;
    }
}
