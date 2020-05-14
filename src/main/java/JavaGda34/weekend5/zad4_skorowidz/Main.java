package JavaGda34.weekend5.zad4_skorowidz;



/*      1. Napisz program do tworzenia skorowidzu liter
        2. Utwórz metode skorowidzLiterowy(String tekst):Map<String, Set<Integer>>
            1. Metoda rozdziela zadany tekst na pojedyncze litery
            2. Następnie iteruje od 0 do n pojedynczych liter
            3. Aktualizuje indeksy wystąpień dla każdej litery
            4. Zwraca mapę w postaci :
                1. litera -> [indeksy wystąpień]
        3. Wyświetla wynik w postaci :
            1. [a -> [2, 3, 5], b- > [1,4]]
        4. Np.
            1. Dla tekstu „Hello”: [e-> [1], l -> [2, 3], o -> [4] , H->[0]]*/
public class Main {

    public static void main(String[] args) {
       /* Scanner in = new Scanner(System.in);
        Map<String, Integer> mapa = new HashMap<>();
        System.out.println("Podaj tekst: ");
        String tekst = in.nextLine();*/

        String tekst ="HELLO";

        System.out.println(Skorowidz.skorowidzLiterowy(tekst));
    }



}
