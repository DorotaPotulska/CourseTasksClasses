package JavaGda34.weekend3.samochod10;

public class Main {
    public static void main(String[] args) {
        Samochod opel = new Samochod(100,false);

        Kabriolet BMV = new Kabriolet(160,true,false);

        opel.przyspiesz();
        opel.przyspiesz();
        opel.przyspiesz();
        opel.przelaczSwiatla();
        opel.czSwiatlaWlaczone();
        opel.przelaczSwiatla();
        opel.czSwiatlaWlaczone();


        BMV.schowajDach();
        BMV.czyDachSchowany();
        BMV.schowajDach();
        BMV.czyDachSchowany();
        BMV.przyspiesz();
        BMV.przelaczSwiatla();
        BMV.przyspiesz();
        BMV.przyspiesz();
        BMV.przyspiesz();
        BMV.przyspiesz();
    }



}
