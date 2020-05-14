package JavaGda34.weekend2.tab_dwuwymiarowe;

public class zad2_tab_dwuwymiarowa {
    public static void main(String[] args) {
        int x=6;
        int y=10;
        int[][] tablica=new int[x][y];
        //zapełnianie tablicy
        for(int i=0;i<tablica.length;i++){
            for(int j=0;j<tablica[i].length;j++){
                tablica[i][j]=i*j;
            }
        }
        //nagłówek
        for(int i=0;i<tablica[0].length;i++){
            System.out.print("\t"+i);
        }
        System.out.println();

        // wyswietlanie tablicy
        for(int i=0;i<tablica.length;i++){
            System.out.print(i+" \t"); //kolumna z nagłówkiem
            for(int j=0;j<tablica[i].length;j++){
                System.out.print(tablica[i][j]+" \t");
            }
            System.out.println();
        }
    }
}
