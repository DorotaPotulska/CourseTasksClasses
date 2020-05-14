package JavaGda34.weekend7._PosortowanyString;

import java.util.Arrays;

public class PosortowanyString {
    public static void main(String[] args) {
        // rozwiazanie 2
        String tekst ="2538";
        String[] tabZnakow=tekst.split("");
        Arrays.sort(tabZnakow);// posortuje inty, char, i Stringi
        System.out.println("Posortowana ");
        for (int i = 0; i < tabZnakow.length; i++) {
            System.out.println(tabZnakow[i]);
        }
        //rozwiązanie 1
        /*String tekst ="2538";
        String[] tabZnakow=tekst.split("");
        //List<Integer> tabInt = new ArrayList<>();
        int[]tabInt=new int[tabZnakow.length];
        for (int i = 0; i <tabZnakow.length ; i++) {
            System.out.println(tabZnakow[i]);
            int tmp;
            tmp=Integer.parseInt(tabZnakow[i]);
            //tabInt.add(tmp);
            tabInt[i]=tmp;
        }
        Arrays.sort(tabInt);
        //Arrays.sort(new List[]{tabInt});
        System.out.println("Posortowana ");
        for (int i = 0; i < tabInt.length; i++) {
            System.out.println(tabInt[i]);
        }*/

    }
}
