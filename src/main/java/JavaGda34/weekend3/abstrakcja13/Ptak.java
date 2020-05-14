package JavaGda34.weekend3.abstrakcja13;

public abstract class Ptak extends Zwierze {
    public Ptak(boolean ogon, String umaszczenie, int iloscKonczyn) {
        super(ogon, umaszczenie, iloscKonczyn);
    }

    @Override
    public void dajGlos() {
        System.out.println("Cwir cwir");
    }

}
