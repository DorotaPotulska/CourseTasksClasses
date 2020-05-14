package JavaGda34.weekend3.enumy7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Bilet normalnyCalodniowy=Bilet.NORMALNY_CALODNIOWY;
       Bilet normalnyGodzinny=Bilet.NORMALNY_GODZINNY;
       Bilet ulgowyCalodniowy =Bilet.ULGOWY_CALODNIOWY;
       Bilet ulgowyGodzinny=Bilet.ULGOWY_GODZINNY;

        System.out.println(ulgowyCalodniowy.pobierzCeneBiletu());
        System.out.println(normalnyCalodniowy.pobierzCzasJazdy());
        normalnyGodzinny.wyswietlDaneOBilecie();

        Bilet zwrocony = Bilet.dobierzBilet(14, 100, 10.0d);
        zwrocony.wyswietlDaneOBilecie();


    }

}
