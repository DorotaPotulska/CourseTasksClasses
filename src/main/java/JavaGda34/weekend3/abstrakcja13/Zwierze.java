package JavaGda34.weekend3.abstrakcja13;

public abstract class Zwierze {
    protected boolean ogon;
    String umaszczenie;
    int iloscKonczyn;
//mozemy stworzyc kontruktor chociaz nie bedziemy mogli stworzyc obiektu zwierze , ale to co mamy tutaj dziedziczyc bedzie kukulka
    public Zwierze(boolean ogon, String umaszczenie, int iloscKonczyn) {
        this.ogon = ogon;
        this.umaszczenie = umaszczenie;
        this.iloscKonczyn = iloscKonczyn;
    }

    public abstract void dajGlos();
}
