package JavaGda34.weekend1.tablice;

public class tabliceZadanie1 {
    public static void main(String[] args) {
        String[] pasazerowie;
        pasazerowie=new String[4];


        pasazerowie[0]="Jan";
        pasazerowie[1]="Zosia";
        pasazerowie[2]="Marek";
        pasazerowie[3]="Kub";
        //wyswietlenie zawarosci tablicy o indeksie 0 // liczymy zawsze od zera
        System.out.println(pasazerowie[0]);
        //wielkosc tablicy
        System.out.println(pasazerowie.length);//lenf

        for(int i=0;i<pasazerowie.length;i++){
            System.out.println(pasazerowie[i]);

        }
        System.out.println();

        for(int i=pasazerowie.length-1;i>=0;i--){
            System.out.println(pasazerowie[i]);

        }
        System.out.println();

        for(int i=pasazerowie.length-1;i>=0;i-=2){
            System.out.println(pasazerowie[i]);

        }
        System.out.println();

        int liczbaInt[];
        int[] tablicaIntow;//tak lepiej deklarowac tablice
        int[] tablica =new int[10];
        char[] tabliceChar=new char[11111];
        String[] tablicaStringow=new String[100];

        tabliceChar[55]='X';
    }
}
