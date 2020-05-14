package JavaGda34.weekend2.metody;
import java.util.Scanner;

/*public class zad9_kalkulator {
    public static void main(String[] args) {

        int[] tablicaLiczb = pobierzLiczby();
        char znak = pobierzZnak();

        System.out.println("Otrzymany wynik " +tablicaLiczb[0]+" "+ znak +" "+tablicaLiczb[1]+ " wynosi: " + Kalkulator(znak, tablicaLiczb));

    }

    public static char pobierzZnak() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj rodzaj działania : *,+,-,/");
        char znak = in.nextLine().charAt(0);
        return znak;

    }

    public static int[] pobierzLiczby() {

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj liczbe 1: ");
        int licznik = in.nextInt();

        System.out.println("Podaj liczbe 2: ");
        int mianownik=in.nextInt();

        int[] tablicaDanych=new int[]{licznik,mianownik};

        return tablicaDanych;
    }

    public static float Kalkulator(char znak, int[] tablicaLiczb) {
        float wynik=0;
        switch (znak) {
            case '+':
                wynik = tablicaLiczb[0]+tablicaLiczb[1];
                break;
            case '-':
                wynik = tablicaLiczb[0]-tablicaLiczb[1];
                break;
            case '*':
                wynik = tablicaLiczb[0]*tablicaLiczb[1];
                break;
            case '/':
                wynik = tablicaLiczb[0]/tablicaLiczb[1];
                break;
            default:
                System.out.println("Podano błedne dane");
                break;

        }
        return wynik;
    }
}*/
public class zad9_kalkulator {
    public static void main(String[] args) {

        int[] tablicaLiczb = pobierzLiczby();
        char znak = pobierzZnak();

        System.out.println("Otrzymany wynik " +tablicaLiczb[0]+" "+ znak +" "+tablicaLiczb[1]+ " wynosi: " + Kalkulator(znak,tablicaLiczb[0],tablicaLiczb[1]));

        //w tym przypadku nie ma to sensu bo bedziemy 2 razy wywływac metodę pobierzLiczby() i pobierac raz 0 element a za drugim razem 1
        //System.out.println("Otrzymany wynik " +tablicaLiczb[0]+" "+ znak +" "+tablicaLiczb[1]+ " wynosi: " + Kalkulator(znak,pobierzLiczby()[0],pobierzLiczby()[1]));

    }

    public static char pobierzZnak() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj rodzaj działania : *,+,-,/");
        char znak = in.nextLine().charAt(0);
        return znak;

    }

    public static int[] pobierzLiczby() {

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj liczbe 1: ");
        int licznik = in.nextInt();

        System.out.println("Podaj liczbe 2: ");
        int mianownik=in.nextInt();

        int[] tablicaDanych=new int[]{licznik,mianownik};

        return tablicaDanych;
    }

    public static float Kalkulator(char znak, int liczba1,int liczba2) {
        float wynik=0;
        switch (znak) {
            case '+':
                wynik = liczba1+liczba2;
                break;
            case '-':
                wynik = liczba1-liczba2;
                break;
            case '*':
                wynik = liczba1*liczba2;
                break;
            case '/':
                wynik = liczba1/liczba2;
                break;
            default:
                System.out.println("Podano błedne dane");
                break;

        }
        return wynik;
    }

}