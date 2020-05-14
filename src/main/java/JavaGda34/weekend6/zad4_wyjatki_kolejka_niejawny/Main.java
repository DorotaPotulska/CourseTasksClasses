package JavaGda34.weekend6.zad4_wyjatki_kolejka_niejawny;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            sprawdzCzyMozeszJechac(pobierzWzrost());
        }catch(InsufficientHeightExcetion e){
            e.printStackTrace();
            System.out.println("Sorki, ale nie pojedziesz");
        }

  //gdy dziedziczy po RunTime...nie trzeba try catch
            //sprawdzCzyMozeszJechac(pobierzWzrost());


    }

    public static int pobierzWzrost(){
        int wzrost;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj swój wzrost");
        wzrost=in.nextInt();
        return wzrost;
    }
    public static boolean sprawdzCzyMozeszJechac(int wzrost) throws InsufficientHeightExcetion{
        if(wzrost>160){
            System.out.println("Zapraszamy na kolejkę, masz odpowiedni wzrost");
            return true;
        }else{
            throw new InsufficientHeightExcetion("Niewystarczajacy wzrost");
        }
    }

}
