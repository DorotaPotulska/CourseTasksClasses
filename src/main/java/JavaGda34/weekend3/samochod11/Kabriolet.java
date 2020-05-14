package JavaGda34.weekend3.samochod11;

public class Kabriolet extends Samochod{

    protected boolean dach;

    public Kabriolet(String kolor, String marka, int rocznik, boolean dach) {
        super(kolor, marka, rocznik);
        this.dach = dach;
    }
    @Override
    public String toString(){
            //return this.kolor+" samochód marki "+this.marka+" rocznik "+ this.rocznik+" z rozsuwanym dachem";
            String stringSamochod =super.toString();
            return stringSamochod+" z rozsuwanym dachem";
        }
}
