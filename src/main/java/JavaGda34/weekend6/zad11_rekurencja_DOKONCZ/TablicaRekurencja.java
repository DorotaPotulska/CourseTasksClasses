package JavaGda34.weekend6.zad11_rekurencja_DOKONCZ;

public class TablicaRekurencja {
    public static void main(String[] args) {
        int[] tablica={45,12,9,-13,42,42,78,21,34,78,0,999};
        int[] tablica2={2,3,4,5,6};
        int[] tablica3={1,1,1,1,1,1,1,1,1,1};
        System.out.println("Sumowanie elementów tablicy");
        System.out.println(sumTab(tablica, 0));
        System.out.println(sumTab(tablica2, 0));
        System.out.println(sumTab(tablica3, 0));
        System.out.println("Największy wspólny dzielnik");
        System.out.println(gdc(2, 3));

        /*System.out.println(nww(3, 5,1));*/
        System.out.println("Ciąg fibbonaciego");
        System.out.println(fibbonaci(7));
        System.out.println("Silnia");
        System.out.println(silnia(13));//trzeba podać longa bo int kończy grabice przy silni z 12 ;)
        System.out.println("Najmniejsza wspólna wielokrotnosc");
        System.out.println(nww(10,5,1));
        //System.out.println(nww2(2,6));
    }

    public static int sumTab(int[] tablica, int i){
        return i<tablica.length ? tablica[i]+sumTab(tablica,i+1): 0;
    }
///największy wspólny dzielnik
    public static int gdc(int a, int b){
        return b!=0?gdc(b,a%b):a;
    }

    //najmniejszą wspólną wielokrotnosc

    public static int nww(int a, int b,int i) {
        int aa=1,bb=1;
        if (i==1) {
            aa=a;
            bb=b;
        }
        i++;
        return b != 0 ?(nww(b, a % b,i)):(aa * bb)/a;
    }



    //(())(aa * bb)/
    public static long silnia (int a){
       return a>0? a*silnia(a-1):1;
   }

   public static int fibbonaci(int a){
       if(a==0|| a==1){
           return a;
       }else{
           return fibbonaci(a-1)+fibbonaci(a-2);
       }

   }

}
