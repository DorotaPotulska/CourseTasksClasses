package JavaGda34.weekend5.zad12_lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*Zadanie 7.0 Napisz program który posortuje wpisane przez użytkownika napisy według ich malejącej długości*/

public class Main {
    public static void main(String[] args) {

        List<String>napisy = Arrays.asList("Merkury","Ziemia","Mars");

        Collections.sort(napisy,(n1,n2)->Integer.compare(n1.length(),n2.length()));
        System.out.println(napisy);

        // odwrotne sortowanie
        Collections.sort(napisy,(n1,n2)->Integer.compare(n2.length(),n1.length()));
        System.out.println(napisy);
    }
}
