package JavaGda34.weekend6.zad5_zPliku;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Notes {
    public static void main(String[] args) throws FileNotFoundException {
        //PrintWriter tekstowy = new PrintWriter("plik.txt");
        PrintWriter tekstowy = new PrintWriter("C:\\Users\\cdc4\\Desktop\\SDA_JAVA\\plik.txt");

        //tekstowy.println("Tekst do zapisu");
        tekstowy.println("cos nowego zapisuje");// nadpisuje przy ponownym uruchomieniu
        tekstowy.close();// Nalezy pamietać o zamknieciu pliku
    }
}
