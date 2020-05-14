package JavaGda34.weekend2.wyscig;
/*Wykonaj poniższe zadania:
        1. Utwórz nowy projekt o nazwie ‚Wyscig’
        2. Utwórz klasę o nazwie Zawodnik
        3. Zawodnik powinien posiadać takie pola jak:
            1. Imie
            2. Identyfikator (numer startowy)
            3. Predkosc minimalna
            4. Predkosc maksymalna
            5. Pokonana odległość
        4. Oraz metody:
            1. przedstawSie():void//wyswietla dane o zawodniku np. „Nazywam się Robert, mam numer 4#, biegam z predkoscia od 10km/h do 20 km/h”
            2. biegnij():void – pokonuje odległość w Random(min, max)* lub max+min/2
        5. W metodzie psvm utwórz 3 zawodników
        6. Przeprowadź symulację zawodów - wywołuj metodę biegnij() na każdym z zawodników dopóki nie wyłonisz zwyciężcy (przebiegnięcie 50 km)*/
public class Main {
    public static void main(String[] args) {
        Zawodnik Piotr=new Zawodnik("Piotr", 8405,5,20,0);
        Zawodnik Dorota=new Zawodnik("Dorota",8504,2,5,0);
        Zawodnik Maks=new Zawodnik("Maksymilian",1513,1,2,0);

        Zawodnik[] TablicaZawodnikow= new Zawodnik[]{Piotr,Dorota,Maks};

        for(int i=0;i<TablicaZawodnikow.length;i++){
            TablicaZawodnikow[i].przedstawSie();
        }
        int i=0;
        while (TablicaZawodnikow[i].pokonanaOdleglosc<=50){
                TablicaZawodnikow[i].pokonanaOdleglosc+=TablicaZawodnikow[i].biegnij();


                if(TablicaZawodnikow[i].pokonanaOdleglosc>=50){

                    System.out.println(TablicaZawodnikow[i].imie+ " You are winner!!");
                    System.out.println(TablicaZawodnikow[i].pokonanaOdleglosc);
                }

            i++;
            if(i%3==0){
                i=0;
            }
        }


    }
}
