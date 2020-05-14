package JavaGda34.weekend6.zad12_binaryReSearch;

import java.util.Arrays;

public class Binary {

    public static void main(String[] args) {
        int[] tablica =new int[]{1,4,6,8,9,23,45,67,89,100};// musi byc posortowana
        Arrays.sort(tablica);
        System.out.println(binarySearch(tablica, 67));
        System.out.println(binarySearch2(tablica, 67,0,tablica.length-1));
        //System.out.println(binarySearch3(tablica, 67));
    }
//iteracyjnie
    public static int binarySearch(int[] tablica, int a){
        int l,r,mid; //left right i mid
        l=0;
        r=tablica.length-1;

        while(l<=r){

            mid=(l+r)/2;

            //jezeli szukana liczba jest na srodku zwróc indeks
            if(tablica[mid]==a){
                return mid;
            }

            //jesli srodek jest mniejszyod szukanej to szukamy w prawej czesci tablicy
            if(tablica[mid]<a){
                l=mid+1;
                ///jesli wejdziemy w elsa rtzn ze szukana jest w lewej czesci tablicy
            }else{
                r=mid-1;

            }

        }
        return -1;


    }
///rekurencyjnie
    public static int binarySearch2(int[] tablica, int a, int l, int r){
        int mid; //left right i mid

        mid=(l+r)/2;

        if(l<=r){

            mid=(l+r)/2;

            //jezeli szukana liczba jest na srodku zwróc indeks
            if(tablica[mid]==a){
                return mid;
            }

            //jesli srodek jest mniejszyod szukanej to szukamy w prawej czesci tablicy
            if(tablica[mid]<a){
                return binarySearch2(tablica,a,mid+1,r);
                ///jesli wejdziemy w elsa rtzn ze szukana jest w lewej czesci tablicy
            }else{
                return binarySearch2(tablica,a,l,mid-1);

            }

        }
        return -1;
    }
// fasada, obudowanie zeby nie podawac l i r
/*    public static int binarySearch3(int[] tablica, int a){
        return binarySearch2(int[] tablica, int a, 0, tablica.length-1);
    }*/

}
