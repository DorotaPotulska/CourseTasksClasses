package JavaGda34.weekend3.polimorfizm15;

public class Kolo extends Figura {

    double promien;
    final double PI=3.14;

    public Kolo(double promien) {
        this.promien = promien;
    }

    @Override
    public double obliczPole(){
        return promien*promien*PI ;
    }
}
