package JavaGda34.weekend2.obiektowe2;
/*1. Aktualizacja klasy Osoba
        2. Dodanie konstruktora
        3. Utworzenie dodatkowych 3 obiektów typu osoba za pomocą konstruktora
        4. Umieszczenie wszystkich obiektów Osoba do tablicy
        5. Wyświetlenie wszystkich osób z tablicy w pętli
        6. * Wyświetlenie tylko pań
        7. * Wyświetlenie tylko panów*/
public class Main2 {

    public static void main(String[] args) {

        Osoba2 ania =new Osoba2("Ania",25,'K');
        Osoba2 andrzej=new Osoba2("Andrzej",54,'M');
        Osoba2 mariola=new Osoba2("Mariola",68,'K');

        Osoba2[]tablicaOsob=new Osoba2[]{ania,andrzej,mariola};


        System.out.println(tablicaOsob[0]);

        for(int i=0;i<tablicaOsob.length;i++){

            System.out.println(tablicaOsob[i].imie);

        }
        System.out.println("Wyświetlenie tylko pań ");
        for(int i=0;i<tablicaOsob.length;i++){
            if(tablicaOsob[i].plec=='K'){
                System.out.println(tablicaOsob[i].imie);
            }
        }
        System.out.println("Wyświetlenie tylko panów");
        for(int i=0;i<tablicaOsob.length;i++){
            if(tablicaOsob[i].plec=='M'){
                System.out.println(tablicaOsob[i].imie);
            }
        }
        System.out.println();
        for(int i=0;i<tablicaOsob.length;i++){
            tablicaOsob[i].przedstawSie();

        }
        System.out.println();
        for(int i=0;i<tablicaOsob.length;i++){
            if(tablicaOsob[i].plec=='M'){
                System.out.println("Pan "+tablicaOsob[i].imie);
            }else if(tablicaOsob[i].plec=='K'){
                System.out.println("Pani "+tablicaOsob[i].imie);
            }
        }

    }
}
