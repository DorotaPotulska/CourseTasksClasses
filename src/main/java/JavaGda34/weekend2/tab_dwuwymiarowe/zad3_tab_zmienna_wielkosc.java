package JavaGda34.weekend2.tab_dwuwymiarowe;

public class zad3_tab_zmienna_wielkosc {
    public static void main(String[] args) {
        int[][] nieregularna = new int[10][]; //wystarczy wskazac pierwszą wielkosc, kolejnych nie trzeba

        for (int i=0;i<nieregularna.length;i++){
            nieregularna[i]=new int [i];
        }

        for(int i=0;i<nieregularna.length;i++){
            for(int j=0;j<nieregularna[i].length;j++){
                nieregularna[i][j]=1;
            }
        }

        for(int i=0;i<nieregularna.length;i++){
            for(int j=0;j<nieregularna[i].length;j++){
                System.out.print(nieregularna[i][j]);
            }
            System.out.println();
        }


    }
}
