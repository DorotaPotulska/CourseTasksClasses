package JavaGda34.weekend4.typy_generyczne.zad1_dokończ_pkt6;

public class Samochod {
    protected String marka;
    protected String model;
    protected String kolor;


    public Samochod(String model, String kolor) {
        this.model = model;
        this.kolor = kolor;
    }

    public void zmienKolor(String kolor) {
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", kolor='" + kolor + '\'' +
                '}';
    }
}
