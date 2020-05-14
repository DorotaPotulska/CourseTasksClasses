package JavaGda34.weekend6.zad7_zPliku;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File plik = new File("C:\\Users\\cdc4\\Desktop\\SDA_JAVA\\plik.txt");
        Scanner wejscie = new Scanner(plik);
        List <String> lista= new ArrayList<>();

        while(wejscie.hasNextLine()){//sprawdzenie czy jest kolejna linia
                lista.add(wejscie.nextLine());
        }
        System.out.println(lista);

        /*wejscie.nextLine()
        if(wejscie.hasNext()){
            String linia = wejscie.nextLine();//pierwsza linia z pliku
            System.out.println(linia);
        };
        String linia = wejscie.nextLine();//pierwsza linia z pliku
        System.out.println(linia);
        String linia2 = wejscie.nextLine();//pierwsza linia z pliku
        System.out.println(linia2);
        String linia3 = wejscie.nextLine();//pierwsza linia z pliku
        System.out.println(linia3);
        String linia4 = wejscie.nextLine();//pierwsza linia z pliku
        System.out.println(linia4);
*/

    }
}
