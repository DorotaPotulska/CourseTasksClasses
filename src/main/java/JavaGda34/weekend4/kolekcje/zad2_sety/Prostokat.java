package JavaGda34.weekend4.kolekcje.zad2_sety;

public class Prostokat extends Figura{

    int bokA;
    int bokB;

    public Prostokat(int bokA, int bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    @Override
    public double obliczPole() {
        return this.bokA*this.bokB ;
    }

    @Override
    public String toString() {
        return "Prostokat{" +
                "bokA=" + bokA +
                ", bokB=" + bokB +
                ", pole=" + obliczPole()+
                '}';
    }
}
