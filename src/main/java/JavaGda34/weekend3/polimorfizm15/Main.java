package JavaGda34.weekend3.polimorfizm15;

public class Main {
    public static void main(String[] args) {
        //tez tak moze byc ale lepiej z poliformizmu wziasc Figura
      /*  Kolo kolo=new Kolo(5);
        Kwadrat kwadrat=new Kwadrat(10);
        Prostokat prostokat=new Prostokat(10,20);*/


        Figura kolo=new Kolo(5);
        Figura kwadrat=new Kwadrat(10);
        Figura prostokat=new Prostokat(10,20);


        Figura[] tablicaFigur={kolo,kwadrat,prostokat};

        System.out.println(SymulatorFarby.obliczZapotrzebowanieNaFarbe(tablicaFigur, 10));
    }
}
