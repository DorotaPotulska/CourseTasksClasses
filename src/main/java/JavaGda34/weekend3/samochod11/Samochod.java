package JavaGda34.weekend3.samochod11;

public class Samochod {
    protected String kolor;
    protected String marka;
    protected int rocznik;

    public Samochod(String kolor, String marka, int rocznik) {
        this.kolor = kolor;
        this.marka = marka;
        this.rocznik = rocznik;
    }

    @Override
    public String toString(){
        return this.kolor + " samochód marki "+this.marka+" rocznik "+this.rocznik;
    }

    @Override
    public boolean equals(Object obj) {
        //czy te obiekty wskazują na to samo miejsce na stercie - jedno miejsce w chmurze
            if (this == obj) {
                return true;
            }
            //czy sa tej samej klasy lub jeden porównywany jest nullem
            if (obj == null || this.getClass() != obj.getClass()) {
                return false;
            }
            Samochod samochod= (Samochod) obj;
            if (this.rocznik == samochod.rocznik && this.kolor.equals(samochod.kolor)&& this.marka.equals(samochod.marka)) {
                return true;
            }
            return false;

    }

}
