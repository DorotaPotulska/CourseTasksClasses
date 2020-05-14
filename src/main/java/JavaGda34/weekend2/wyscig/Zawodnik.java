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
public class Zawodnik {

    String imie;
    int identyfikator;
    int predkoscMinimalna;
    int predkoscMaksymalna;
    int pokonanaOdleglosc;

    public Zawodnik(String imie,int identyfikator,int predkoscMinimalna,int predkoscMaksymalna,int odleglosc){
        this.imie=imie;
        this.identyfikator=identyfikator;
        this.predkoscMaksymalna=predkoscMaksymalna;
        this.predkoscMinimalna=predkoscMinimalna;
        this.pokonanaOdleglosc=odleglosc;
    }
    public void przedstawSie(){
        System.out.println("Nazywam się "+imie+", mam numer "+identyfikator+", biegam z predkoscią "+predkoscMinimalna+"km/h do "+predkoscMaksymalna+"km/h");
    }

    public int biegnij(){
        return pokonanaOdleglosc=(predkoscMinimalna+predkoscMaksymalna)/2;
    }
}
