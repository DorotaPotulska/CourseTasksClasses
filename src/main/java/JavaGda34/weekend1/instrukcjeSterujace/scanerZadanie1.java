package JavaGda34.weekend1.instrukcjeSterujace;

import java.util.Scanner;

public class scanerZadanie1 {
    public static void main(String[] args) {
        int liczba;
        //3,5 8 szczesliwa liczba
        //0 10
        //10 20
        //20 30
        Scanner podanaLiczba = new Scanner(System.in);
        System.out.println("Podaj liczbę z przedziału (0,30]:");
        liczba = podanaLiczba.nextInt();

        System.out.println("Twoja liczba to:" + liczba);

        if (liczba > 0 && liczba <= 10) {
            switch (liczba) {
                case 3:
                    System.out.println("To szczęśliwa liczba, wygrałeś nagrodę nr 1");
                    break;
                case 5:
                    System.out.println("To szczęśliwa liczba, wygrałeś nagrodę nr 2");
                    break;
                case 8:
                    System.out.println("To szczęśliwa liczba, wygrałeś nagrodę nr 3");
                    break;
                default:
                    System.out.println("Liczba jest z przedziału (0,10]");
                    break;

            }
        } else if (liczba > 10 && liczba <= 20) {
            System.out.println("Liczba jest z przedziału (10,20]");
        } else if (liczba>20 && liczba <= 30) {
            System.out.println("Liczba jest z przedziału (20,30]");
        } else
            System.out.println("Liczba nie jest z przedziału od 0 do 30");

    }

}
