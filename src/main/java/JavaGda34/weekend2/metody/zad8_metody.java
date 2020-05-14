package JavaGda34.weekend2.metody;
/*Metody statyczne - zadanie 1. Utwórz program ‚Kalkulator’
        1. Nadpisz punkt wejścia, tak aby wyświetlał następującą instrukcję po uruchomieniu:
        „Podaj rodzaj działania : *,+,-,/”
        „Podaj pierwszą liczbę”
        „Podaj druga liczbę”
        „Otrzymany wynik {działanie} wynosi: {wynik}”
        2. Użyj switcha do wybrania rodzaju metody
        3. Użyj switcha do wydrukowania końcowego wyniku (np. ‚+’  ’dodawania’)
        np. po wpisaniu przez użytkownika ‚+’, ‚2’, ‚3’
        wyświetlony zostanie tekst: Wynik dodawania liczb 2 i 3 wynosi: 5*/
import java.util.Scanner;

/*Metody statyczne - zadanie
        1. Utwórz program ‚Kalkulator’
        1. Nadpisz punkt wejścia, tak aby wyświetlał następującą instrukcję po uruchomieniu:
        „Podaj rodzaj działania : *,+,-,/”
        „Podaj pierwszą liczbę”
        „Podaj druga liczbę”
        „Otrzymany wynik {działanie} wynosi: {wynik}”
        2. Użyj switcha do wybrania rodzaju metody
        3. Użyj switcha do wydrukowania końcowego wyniku (np. ‚+’  ’dodawania’)
        np. po wpisaniu przez użytkownika ‚+’, ‚2’, ‚3’
        wyświetlony zostanie tekst: Wynik dodawania liczb 2 i 3 wynosi: 5*/
/*public class zad8_metody {
    public static void main(String[] args) {

        System.out.println("Podaj rodzaj działania : *,+,-,/");
        String znak = pobierzZnak();
        System.out.println("Podaj pierwszą liczbę");
        int liczba1 = pobierzLiczbe();
        System.out.println("Podaj druga liczbę");
        int liczba2 = pobierzLiczbe();

        System.out.println("Otrzymany wynik " +liczba1+" "+ znak +" "+liczba2+ " wynosi: " + Kalkulator(znak, liczba1, liczba2));


    }

    public static String pobierzZnak() {
        Scanner in = new Scanner(System.in);
        String znak = in.nextLine();
        return znak;

    }

    public static int pobierzLiczbe() {
        Scanner in = new Scanner(System.in);
        int liczba = in.nextInt();
        return liczba;
    }

    public static int Kalkulator(String znak, int liczba1, int liczba2) {
        int wynik=0;
        switch (znak) {
            case "+":
                wynik = liczba1 + liczba2;
                break;
            case "-":
                wynik = liczba1 - liczba2;
                break;
            case "*":
                wynik = liczba1 * liczba2;
                break;
            case "/":
                wynik = liczba1 / liczba2;
                break;
            default:
                System.out.println("Podano błedne dane");
                break;

        }
        return wynik;
    }
}*/

//////////////////////Dzialamy na CHAR charAt() - pobierany znak działania
public class zad8_metody {
    public static void main(String[] args) {

        System.out.println("Podaj rodzaj działania : *,+,-,/");
        char znak = pobierzZnak();
        System.out.println("Podaj pierwszą liczbę");
        int liczba1 = pobierzLiczbe();
        System.out.println("Podaj druga liczbę");
        int liczba2 = pobierzLiczbe();

        System.out.println("Otrzymany wynik " +liczba1+" "+ znak +" "+liczba2+ " wynosi: " + Kalkulator(znak, liczba1, liczba2));


    }

    public static char pobierzZnak() {
        Scanner in = new Scanner(System.in);
       char znak = in.nextLine().charAt(0);
       return znak;

    }

    public static int pobierzLiczbe() {
        Scanner in = new Scanner(System.in);
        int liczba = in.nextInt();
        return liczba;
    }

    public static float Kalkulator(char znak, int liczba1, int liczba2) {
        float wynik=0;
        switch (znak) {
            case '+':
                wynik = liczba1 + liczba2;
                break;
            case '-':
                wynik = liczba1 - liczba2;
                break;
            case '*':
                wynik = liczba1 * liczba2;
                break;
            case '/':
                wynik = liczba1 / liczba2;
                break;
            default:
                System.out.println("Podano błedne dane");
                break;

        }
        return wynik;
    }
}