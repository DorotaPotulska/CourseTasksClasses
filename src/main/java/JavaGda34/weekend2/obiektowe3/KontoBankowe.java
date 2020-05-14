package JavaGda34.weekend2.obiektowe3;
/*1. Utwórz klasę KontoBankowe
        2. Nadaj pola publiczne :
            • numerKonta : long
            • stanKonta: int
        3. Utwórz metody:
            • wyswietlStanKonta():void
            • wplacSrodki(int):void
            • pobierzSrodki(int):int
        4. Utwórz 2 obiekty:
            1. kontoAndrzeja(123L, 1000)
            2. kontoBeaty(555L, 2000)
            3. Przetestuj przesył pieniędzy pomiędzy kontami*/
public class KontoBankowe {
    long numerKonta;
    int stanKonta;

    public KontoBankowe(long numerKonta,int stanKonta){
        this.numerKonta=numerKonta;
        this.stanKonta=stanKonta;
    }

    public void wyswietlStanKonta(){
        System.out.println(stanKonta);
    }
    public void wplacSrodki(int wplata){
        stanKonta+=wplata;
    }

    public int pobierzSrodki(int wyplata){
        stanKonta-=wyplata;
        return wyplata;
    }
}
