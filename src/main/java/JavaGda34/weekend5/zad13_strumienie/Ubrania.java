package JavaGda34.weekend5.zad13_strumienie;


public class Ubrania {

    public final String nazwa;
    public final double cena;
    public final int rozmiar;
    public final String material;
    public final String kolor;
    public final String typ;

    public Ubrania(String nazwa, double cena, int rozmiar, String material, String kolor, String typ) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.rozmiar = rozmiar;
        this.material = material;
        this.kolor = kolor;
        this.typ = typ;
    }
    @Override
    public String toString() {
        return "Ubranie {" +
                "nazwa =" + nazwa +
                ", cena=" + cena +
                ", rozmiar=" + rozmiar +
                ", material=" + material +
                ", kolor=" + kolor +
                ", typ=" + typ +
                '}';
    }
}
