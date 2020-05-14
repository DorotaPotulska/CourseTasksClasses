package JavaGda34.weekend4.kolekcje.zad2_sety;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*      1. Utwórz klasę abstrakcyjną Figura
        2. Dodaj metodę abstrakcyjną obliczPole():double
        3. Zaimplementuj interfejs Comparable tak aby sortować względem wielkości pola
        4. Nadpisz metodę .toString() aby zwracać wielkość pola
        5. Napisz klasy Kwadrat oraz Prostokąt dziedziczące po Figurze
        6. Utwórz kilka obiektów typu Kwadrat i Prostokąt i umieść w Secie przechowującym typ Figura
        7. Wydrukuj wszystkie obiekty
        8. Podmień implementację seta i zaobserwuj różnice
            1. HashSet
            2. LinkedHashSet
            3. TreeSet*/
public class Main {
    public static void main(String[] args) {



        HashSet<Figura> figury = new HashSet<>();

        LinkedHashSet<Figura> figury2=new LinkedHashSet<>();//zachowana kolejnosc dodawania

        TreeSet<Figura> figury3=new TreeSet<>();//posortowane po wielkosci pola


        Kwadrat kwadrat1= new Kwadrat(4);
        Kwadrat kwadrat2= new Kwadrat(3);
        Kwadrat kwadrat3= new Kwadrat(5);
        Prostokat prostokat1= new Prostokat(5,2);
        Prostokat prostokat2= new Prostokat(3,6);

        figury.add(kwadrat1);
        figury.add(kwadrat2);
        figury.add(kwadrat3);
        figury.add(prostokat1);
        figury.add(prostokat2);

        System.out.println(figury.toString());

        figury2.add(kwadrat1);
        figury2.add(kwadrat2);
        figury2.add(kwadrat3);
        figury2.add(prostokat1);
        figury2.add(prostokat2);
        System.out.println(figury2.toString());

        figury3.add(kwadrat1);
        figury3.add(kwadrat2);
        figury3.add(kwadrat3);
        figury3.add(prostokat1);
        figury3.add(prostokat2);
        System.out.println(figury3.toString());
    }
}
