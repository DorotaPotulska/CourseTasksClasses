package JavaGda34.weekend3.enumy6;

public enum Bilet {
    NORMALNY(3.2d),
    ULGOWY(1.6d),//d ja double, bez d byłby to float
    RODZINNY(2.8d);

    // to jest konstruntor
    Bilet(double cena){
        this.cena=cena;
    }
    private double cena;

    public double getCena() {
        return cena;
    }



}
