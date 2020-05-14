package JavaGda34.weekend3.polimorfizm15;

public class Prostokat extends Figura {

    protected double bokA;//tylko kwadrat dziedziczy z prostokata wiec bok a wystarczy a bok B blokujemy
    private double bokB;

    public Prostokat(double bokA,double bokB){
        this.bokA=bokA;
        this.bokB=bokB;
    }
    @Override
    public double obliczPole(){
        return bokA*bokB;
    }
}
