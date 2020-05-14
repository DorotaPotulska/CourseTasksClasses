package JavaGda34.weekend3.kolo12;

public class Kolo {

    protected double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }

    protected final double pi = 3.14d;
//przeciązanie metod // mozna przeciązać metody finalne, nie mozna ich nadpisywac ale przeciazac mozna
    public final double obliczPole() {

        return pi * this.promien * this.promien;
    }

    public final double obliczPole(int a) {

        return 5;
    }

    public final double obliczPole(double b) {

        return 15;
    }
}
