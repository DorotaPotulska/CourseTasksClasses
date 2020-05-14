package JavaGda34.weekend2.tab_dwuwymiarowe;
/*1. Utwórz tablicę liczb {1,3,5,10}
2. Wypisz z dwa elementy po indeksie
        3. Wypisz elementy w pętli
        4. Wypisz tylko liczby o parzystym indeksie
        5. Wypisz tylko liczby parzyste
        6. *Wypisz elementy w odwróconej kolejności*/
import java.util.Arrays;

public class zad1_tablice {
    public static void main(String[] args) {
        int[] tablica=new int[]{1,3,5,10};

        System.out.println("Dwa elementy po indeksie ");
        System.out.println("Element o ideksie drugim "+tablica[2]);
        System.out.println("Element na ostatnim miejscu "+tablica[tablica.length-1]);
        System.out.println("Elementy w pętli");
        for(int x:tablica){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("Liczby o parzystym indeksie ");
        for(int j=0;j<tablica.length;j++){
            if(j%2==0){
                System.out.print(tablica[j] +" ");
            }
        }
        System.out.println();
        System.out.println("Liczby parzyste ");
        for (int k=0;k<tablica.length;k++){
            if(tablica[k]%2==0){
                System.out.print(tablica[k]+" ");
            }
        }
        System.out.println();
        System.out.println("Elementy w odwróconej kolejności");

        for(int l=tablica.length;l>0;l--){
            System.out.print(tablica[l-1]+" ");
        }

    }
}
