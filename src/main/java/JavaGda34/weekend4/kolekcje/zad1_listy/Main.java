package JavaGda34.weekend4.kolekcje.zad1_listy;

/*      1. Utwórz listę kilku elementów typu String, a następnie prześledź:
            1. Działanie metody add(E e)
            2. Działanie metody set(E e, int index)
            3. Działanie metody indexOf(Object o)
            4. Działanie metody lastIndexOf(Object o)
            5. Działanie metody remove(Object o)
            6. Działanie metody remove(index int)
        2. Utwórz metodę do wyświetlania zduplikowanych elementów w liście
        3. Utwórz metodę do usuwania zduplikowanych elementów w liście*/

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        System.out.println(lista);
        lista.add("Dorota");
        lista.add("Piotr");
        lista.add("Maks");
        lista.add("Anastazja");

        System.out.println(lista);

        lista.set(2,"Zuzia");

        System.out.println(lista.size());
        System.out.println(lista);

        lista.indexOf("Anastazja");
        lista.add("Anastazja");
        System.out.println(lista);
        System.out.println(lista.lastIndexOf("Anastazja"));

        lista.remove("Zuzia");

        System.out.println(lista);

        //lista.remove(3);

        System.out.println(lista);
        System.out.println("Wyświetlam duplikaty");
        wyswietlDuplikaty((ArrayList<String>) lista);
        System.out.println("Usuwam duplikaty");
        usunDuplikat((ArrayList<String>) lista);

    }

    public static void wyswietlDuplikaty(ArrayList<String>lista){
        int ilosc=0;

        for ( int i=0;i<lista.size();i++){

            for ( int j=i;j<lista.size();j++){

                if(lista.get(i).contains(lista.get(j))){
                    ilosc++;
                }

            }
            if(ilosc>1){
                System.out.println(lista.get(i));
            }
            ilosc=0;
        }

    }

    public static void usunDuplikat(ArrayList<String>lista){
        int ilosc=0;
        for ( int i=0;i<lista.size();i++) {

            for (int j = i; j < lista.size(); j++) {
                if (lista.get(i).contains(lista.get(j))) {
                    ilosc++;
                }

            }
            if (ilosc > 1) {
               lista.remove(lista.get(i));

            }
            ilosc = 0;
        }
        System.out.println(lista);
    }
}
