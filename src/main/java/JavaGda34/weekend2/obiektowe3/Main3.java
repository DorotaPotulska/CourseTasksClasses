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
public class Main3 {
    public static void main(String[] args) {
        KontoBankowe kontoAndrzeja=new KontoBankowe(123L,1000);
        KontoBankowe kontoBeaty=new KontoBankowe(555L,2000);

        KontoBankowe tablicaKont[]=new KontoBankowe[]{kontoAndrzeja,kontoBeaty};

        System.out.println();
        for(int i=0;i<tablicaKont.length;i++){
            tablicaKont[i].wyswietlStanKonta();
        }


        kontoAndrzeja.wplacSrodki(33);
        kontoBeaty.pobierzSrodki(55);

        System.out.println();
        for(int i=0;i<tablicaKont.length;i++){
            tablicaKont[i].wyswietlStanKonta();
        }

        kontoBeaty.wplacSrodki(kontoAndrzeja.pobierzSrodki(5));


        System.out.println();
        for(int i=0;i<tablicaKont.length;i++){
            tablicaKont[i].wyswietlStanKonta();
        }
    }

}
