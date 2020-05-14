package JavaGda34.weekend6.zad8_listaDoPliku;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> lista=new ArrayList<>();

        lista.add("Poniedzialek");
        lista.add("Wtorek");
        lista.add("Sroda");
        lista.add("Czwartek");
        lista.add("Piatek");
        lista.add("Sobota");
        lista.add("Niedziela");

        System.out.println(lista);

        PrintWriter tekstowy = new PrintWriter("C:\\Users\\cdc4\\Desktop\\SDA_JAVA\\dniTygodnia.txt");

        for(String i:lista){
            tekstowy.append(i+"\n");
        }
        tekstowy.close();

    }
}
