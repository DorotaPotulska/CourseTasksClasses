package JavaGda34.weekend3.dziedziczenie8;

public class Ptak {
    double rozpietoscSkrzydel;
    String umaszczenie;

    //ustawienie pustego konstruktora jest rozwiazaniem jesli konstruktor klasy nadrzednej również jest pusty
    //jest to rozwiazanie zamiast super z oznaczeniem co dziedziczymy
    public Ptak(){

    }
    public Ptak(double rozpietoscSkrzydel, String umaszczenie) {
        this.rozpietoscSkrzydel = rozpietoscSkrzydel;
        this.umaszczenie = umaszczenie;
    }

    public void dajGlos(){
        System.out.println("Cwir Cwir");
    }
}
