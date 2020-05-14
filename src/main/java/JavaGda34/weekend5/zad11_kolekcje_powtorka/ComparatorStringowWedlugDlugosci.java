package JavaGda34.weekend5.zad11_kolekcje_powtorka;

import java.util.Comparator;

public class ComparatorStringowWedlugDlugosci implements Comparator<String> {


    @Override
    public int compare(String s, String t1) {
        return Integer.compare(s.length(),t1.length());
    }
}
