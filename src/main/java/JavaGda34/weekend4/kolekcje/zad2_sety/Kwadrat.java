package JavaGda34.weekend4.kolekcje.zad2_sety;

public class Kwadrat extends Figura {

    int bokA;

    public Kwadrat(int bokA) {
        this.bokA = bokA;
    }

    @Override
    public double obliczPole() {
        return this.bokA*this.bokA;
    }

    @Override
    public String toString() {
        return "Kwadrat{" +
                "bokA=" + bokA +" pole= "+obliczPole()+
                '}';
    }
}
