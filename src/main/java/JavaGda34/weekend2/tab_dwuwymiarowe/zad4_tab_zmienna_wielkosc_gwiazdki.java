package JavaGda34.weekend2.tab_dwuwymiarowe;

public class zad4_tab_zmienna_wielkosc_gwiazdki {
    public static void main(String[] args) {
        String[][] nieregularna = new String[10][]; //wystarczy wskazac pierwszą wielkosc, kolejnych nie trzeba

        for (int i=0;i<nieregularna.length;i++){
            nieregularna[i]=new String [i];
        }

        for(int i=0;i<nieregularna.length;i++){
            for(int j=0;j<nieregularna[i].length;j++){
                nieregularna[i][j]="*";
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
