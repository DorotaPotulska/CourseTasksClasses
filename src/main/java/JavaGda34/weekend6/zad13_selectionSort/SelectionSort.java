package JavaGda34.weekend6.zad13_selectionSort;
//rotowanie przez wybieranie
public class SelectionSort {
    public static void main(String[] args) {
        int[] tablica = {33, 5, 67, 2, 8, 56};
        int[] tablicaPosortowana = selectionSort(tablica);

        for (int i = 0; i < tablicaPosortowana.length; i++) {
            System.out.println(tablicaPosortowana[i]);
        }
    }

    public static int[] selectionSort(int[] tablica) {

            for (int i = 0; i < tablica.length; i++) {//-1 bo nie musze robic ostatniej zamiany
                int minIndex = i;
                for (int j = i+1; j < tablica.length; j++) {//i+1 zeby nie poriwnywac tego samego elementu z samym soba
                    if (tablica[minIndex] > tablica[j]) {
                        minIndex = j;
                    }
                }
                  int temp =tablica[minIndex];
                    tablica[minIndex]=tablica[i];
                    tablica[i]=temp;
                }


        return tablica;
    }
}