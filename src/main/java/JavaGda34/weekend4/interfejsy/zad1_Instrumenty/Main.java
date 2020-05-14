package JavaGda34.weekend4.interfejsy.zad1_Instrumenty;
/*      1. Utwórz interfejs Instrumentalny
        2. Dodaj metodę graj():void, która wyświetli dźwięk grania w formie tekstu
        3. Utwórz klasy Bęben, Gitara, Pianino
        4. Zaimplementuj interfejs w klasach
        5. Przetestuj działanie tworząc po 1 obiekcie z każdej klasy*/
public class Main {
    public static void main(String[] args) {
        Instrumentalny gitara = new Gitara();
        Instrumentalny beben=new Beben();
        Instrumentalny pianino=new Pianino();

        Instrumentalny[] tabInstrumentow={gitara,pianino,beben};

        for(int i=0; i<tabInstrumentow.length;i++){
            tabInstrumentow[i].graj();
        }

        System.out.println("drugi sposob ");
        gitara.graj();
        beben.graj();
        pianino.graj();
    }
}
