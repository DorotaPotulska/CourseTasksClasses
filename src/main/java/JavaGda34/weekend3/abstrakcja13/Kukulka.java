package JavaGda34.weekend3.abstrakcja13;

public class Kukulka extends Ptak {
    private int iloscPodrzuconychJajek;

    public Kukulka(int iloscPodrzuconychJajek, boolean ogon, String umaszczenie, int iloscKonczyn) {
        super(ogon,umaszczenie,iloscKonczyn);
        this.iloscPodrzuconychJajek = iloscPodrzuconychJajek;
    }

    @Override
    public void dajGlos() {
        System.out.println("Ku ku");
    }
}
