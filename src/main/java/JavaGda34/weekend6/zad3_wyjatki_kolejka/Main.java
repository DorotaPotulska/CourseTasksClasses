package JavaGda34.weekend6.zad3_wyjatki_kolejka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try{
            sprawdzCzyMozeszJechac(pobierzWzrost());
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Sorki, ale nie pojedziesz");
        }

    }

    public static int pobierzWzrost(){
        int wzrost;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj swój wzrost");
        wzrost=in.nextInt();
        return wzrost;
    }
    public static boolean sprawdzCzyMozeszJechac(int wzrost) throws Exception{
        if(wzrost>160){
            System.out.println("Zapraszamy na kolejkę, masz odpowiedni wzrost");
            return true;
        }else{
            throw new Exception ("Nie możesz jechać kolejką, masz za mało wzrostu");
        }
    }

}
