package JavaGda34.weekend1.instrukcjeSterujace;

public class petlaFor4 {
    public static void main(String[] args) {
        int m;
        int n;
        int wynik;

        wynik=1;
        n=5;
        m=3;
        //Napisz program wyznaczający potęgę liczby n i m – obie zadane przez użytkownika i drukujący w czytelny sposób wynik na ekranie konsoli
        for(int i=0;i<m;i++){
                wynik=wynik*n;
        }
        System.out.println("Liczba "+n+" do potęgi "+m +" wynosi "+wynik);
    }
}
