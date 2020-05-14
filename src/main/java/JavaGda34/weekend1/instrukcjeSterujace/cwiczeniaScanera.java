package JavaGda34.weekend1.instrukcjeSterujace;

import java.util.Scanner;

public class cwiczeniaScanera {
    public static void main(String[] args) {
        String tekst;

        Scanner zmiennaTypuScaner = new Scanner(System.in);
        tekst = zmiennaTypuScaner.nextLine();

        System.out.println(tekst);
    }

}

