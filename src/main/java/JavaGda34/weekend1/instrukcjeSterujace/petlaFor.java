package JavaGda34.weekend1.instrukcjeSterujace;

public class petlaFor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Jestem w petli po raz:" + i);
        }
        System.out.println("Kolejna pętla\n\n");
        for (int i = 0; i < 10; i+=2) {
            System.out.println("Jestem w petli po raz:" + i);
        }

        System.out.println("Kolejna pętla\n\n");
        for (int i = -100; i < 1000; i++) {
            if(i%7==0){
                System.out.println("Liczby podzielne przez 7:" + i);
            }
        }
        /* /-100-200 podzielne przez 4 */
        System.out.println("Kolejna pętla\n\n");
        for (int i = -200; i < -100; i++) {
            if(i%4==0){
                System.out.println("Liczby podzielne przez 4:" + i);
            }

        }
    }
}
