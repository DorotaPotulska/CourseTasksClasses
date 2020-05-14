package JavaGda34.weekend2.metody;
/*1. Napisz program, który będzie posiadał następujące metody statyczne:
        1. drukujParzystoscLiczby
            1. Przyjmuje pojedynczy parametr w postaci liczby całkowitej
            2. Zwraca nic
            3. Drukuje na ekranie wynik „liczba jest parzysta” gdy liczba jest parzysta i „liczba jest nieparzysta” dla nieparzystej liczby
        2. czyLiczbaJestParzysta
            1. Przyjmuje pojedynczy parametr w postaci liczby całkowitej
            2. Zwraca typ logiczny w postaci wyniku obliczenia parzystości liczby
        3. * Zastanów się w jaki sposób mógłbyś ułatwić sobie życie i zminimalizować liczbę zduplikowanego kodu*/
public class zad6_metody_statyczne {
    public static void main(String[] args) {

        drukujParzystoscLiczby(5);
        System.out.println(czyLiczbaJestParzysta(6));
    }

    public static void drukujParzystoscLiczby(int liczba){

        if(liczba%2==0){
            System.out.println("Liczba jest parzysta");
        }else {
            System.out.println("Liczba jest nieparzysta");
        }

    }

    public static boolean czyLiczbaJestParzysta(int liczba) {

        return liczba % 2 == 0;

    }
}
