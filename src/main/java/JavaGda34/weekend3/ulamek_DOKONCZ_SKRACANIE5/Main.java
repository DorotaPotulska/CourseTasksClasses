package JavaGda34.weekend3.ulamek_DOKONCZ_SKRACANIE5;

public class Main {
    public static void main(String[] args) {
        Ulamek pierwszy = new Ulamek(3,5);
        Ulamek drugi =new Ulamek(2,3);

        System.out.println("Ułamek pierwszy: ");
        pierwszy.wypisz();
        System.out.println("Ułamek drugi: ");
        drugi.wypisz();
        System.out.println("Dodajemy ");
        pierwszy.dodaj(drugi);

        System.out.println("Ułamek pierwszy równa się ");
        pierwszy.wypisz();
        System.out.println("Ułamek drugi równa się ");
        drugi.wypisz();
        System.out.println("Odejmujemy");
        pierwszy.odejmij(drugi);
        System.out.println("Mnożymy");
        pierwszy.mnozenie(drugi);
        System.out.println("Dzielimy");
        pierwszy.dzielenie(drugi);
        System.out.println("Skrócony");
        //pierwszy.skroc();

    }


}

