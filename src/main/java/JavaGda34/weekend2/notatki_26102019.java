package JavaGda34.weekend2;

public class notatki_26102019 {
    public static void main(String[] args) {// argumenty to co moze dostac
        //tablice
        String[] pasazerowie = new String[]{"Jan", "Zenek"};

        int[] liczby = new int[]{1, 2, 3, 4, 99};

        //tablice dwuwymiarowe
        //[wiersze][kolumny]
        int[][] nazwaTablicy = new int[6][10];
        nazwaTablicy[2][1] = 5;
        int zmienna = nazwaTablicy[2][1];

        // wielkosc tablicy dwuwymiarowej

        System.out.println(nazwaTablicy.length); // wynik 6
        System.out.println(nazwaTablicy[1].length);//10

        //odwołanie sie do metody

        String jakisTekst = returnAla();
        System.out.println(jakisTekst);

        System.out.println();

        String[] jakisTekst3 = returnAla3();
        System.out.println(jakisTekst3[0]);
        System.out.println(jakisTekst3[1]);

    /*    System.out.println();
        String result=joinTogether("Dorota",'*',55);

        System.out.println(result);*/

        System.out.println();

        System.out.println(joinTogether("Dorota",'*',55));

    }

    // metoda jesli posiada inny tym zwaracany to musi sie konczyc return;
    public static String returnAla() {//() w tych nawiasach argumenty ktore mozna wysylac
        String wierszyk = "Ala ma kota";
        return wierszyk;// to cozwraca metoda, wysyła do innej metody
    }

    //nie trzeba tego pisac gdy typ zwracany to void
    public static void returnAla2() {
        String wierszyk = "Ala ma kota";

    }

    //przekazuwanie wiekszej liczby argumetów
    public static String[] returnAla3() {
        String[] tablicaWiadomosci = new String[2];
        String wierszyk = "Ala ma kota";
        String imie = "Dorota";

        tablicaWiadomosci[0] = wierszyk;
        tablicaWiadomosci[1] = imie;

        return tablicaWiadomosci;
    }

    public static String joinTogether(String base, char character, int number) {
        String joined = base + character + number;

        return joined;
    }

    //zamiana stringa na char nazwaStringa.charAt(ilosc stringow liczac od zera)

    //zamiana stringa na inta suma+= Integer.valueOf(wynik[i]);//zamian Stringa na inta

    // swich dziala na stringach i intach do wersji javy 8 a powyzej na char

    //F7 odpowiada za przejscie do kolejnej lini kodu w debugger
}
