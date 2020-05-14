package JavaGda34.weekend5.zad8_varArgs;

public class Main {
    public static void main(String[] args) {

        dodaj(1,2,3,4,5,5,6);

    }

    public static void dodaj(int... liczba){
        System.out.println("Działa");
    }


}
