package JavaGda34.weekend1.instrukcjeSterujace;

public class zagniezdzaniePetli1 {
    public static void main(String[] args) {
        /*for(int j=0;j<10;j++){
            for(int i=0;i<5;i++){
                System.out.print('*');

            }
            System.out.println();
        }*/

        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < j; i++) {
                System.out.print('*');

            }
            System.out.println();
        }

    }
}
