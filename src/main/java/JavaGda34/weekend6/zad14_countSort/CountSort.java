package JavaGda34.weekend6.zad14_countSort;
//https://visualgo.net/en/sorting
public class CountSort {
    public static void main(String[] args) {
        int[] tablica=new int[]{45,65,1,99,2,8,70};

        tablica=countSort(tablica,100);

        for (int i =0;i<tablica.length;i++){
            System.out.println(tablica[i]);
        }
    }

    public static int[] countSort(int[]tablica, int zakres){
        int[]tablicaWystapien=new int[zakres];

        for(int i=0; i<tablica.length;i++){
            tablicaWystapien[tablica[i]]++;
        }

        int licznik=0;

        for(int i=0; i<tablicaWystapien.length;i++){
            for(int j=0;j<tablicaWystapien[i];j++){
                tablica[licznik]=i;
                licznik++;
            }
        }
        return tablica;
    }
}
