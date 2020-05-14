package JavaGda34.weekend4.interfejsy.zad4_Grzeje_Chlodzi;
/*      1. Utwórz interfejs Chłodzi:
            1. pobierzTemp():double
            2. schlodz():void
        2. Utwórz interfejs Grzeje:
            1. pobierzTemp():double
            2. zwiekszTemp():void
        3. Utwórz 3 klasy: Farelka(Grzeje), Wiatrak(Chłodzi), Klimatyzacja(Grzeje, Chłodzi)
        4. Przetestuj działanie w klasie Main
        5. Dodaj metodę default wyswietlTemp():void w obu interfejsach,
        która wypisuje tekst: „Aktualna temperatura w pomieszczeniu wynosi: xx.x stopni Celsjusza”
        6. * Rozwiąż konflikt dla Klimatyzacji*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj temperature: ");
        double temp = in.nextDouble();

//        Chlodzi wiatrak=new Wiatrak();
        Wiatrak wiatrak=new Wiatrak();
        Farelka farelka = new Farelka();
        Klimatyzacja klimatyzacja =new Klimatyzacja();

        System.out.println("WIATRAK");
        wiatrak.setTemp(temp);
        wiatrak.wyswietlTemp();
        wiatrak.zmniejszTemp();
        wiatrak.pobierzTemp();
        wiatrak.zmniejszTemp();
        wiatrak.pobierzTemp();
        wiatrak.wyswietlTemp();

        System.out.println("FARELKA");
        farelka.setTemp(wiatrak.pobierzTemp());
        farelka.pobierzTemp();
        farelka.zwiekszTemp();
        farelka.wyswietlTemp();

        System.out.println("KLIMATYZACJA");
        klimatyzacja.setTemp(farelka.pobierzTemp());
        klimatyzacja.pobierzTemp();
        klimatyzacja.zmniejszTemp();
        klimatyzacja.wyswietlTemp();
        klimatyzacja.zwiekszTemp();
        klimatyzacja.wyswietlTemp();



    }




}
