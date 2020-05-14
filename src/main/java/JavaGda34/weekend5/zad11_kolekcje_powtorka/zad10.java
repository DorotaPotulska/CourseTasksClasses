package JavaGda34.weekend5.zad11_kolekcje_powtorka;

import java.util.*;

public class zad10 {

    public static void main(String[] args) {

        List<String> listaObecnosci=new ArrayList<>();

        listaObecnosci.add("ala");
        listaObecnosci.add("zygmunt");
        listaObecnosci.add("ola");
        listaObecnosci.add("alan");

        Collections.sort(listaObecnosci);
        System.out.println(listaObecnosci);

        //comparator, i compare z Integer
        Comparator<String> comparatorDlugosci = new ComparatorStringowWedlugDlugosci();
        Collections.sort(listaObecnosci,comparatorDlugosci);

        System.out.println(listaObecnosci);



/*Comparator<String>nowyComparator =new Comparator<String>() {
    @Override
    public int compare(String s, String t1) {
        return Integer.compare(s.length(),t1.length());
    }
}*/

    }
}
