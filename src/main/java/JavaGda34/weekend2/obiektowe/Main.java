package JavaGda34.weekend2.obiektowe;

public class Main {
    public static void main(String[] args) {



        Osoba ania = new Osoba();
        Osoba andrzej = new Osoba();
        Osoba mariola = new Osoba();

        ania.imie = "Ania";
        andrzej.imie = "Andrzej";
        mariola.imie = "Mariola";

        ania.rokUrodzenia = (2019 - 25);
        andrzej.rokUrodzenia = (2019 - 54);
        mariola.rokUrodzenia = (2019 - 68);

        ania.przedstawSie();
        andrzej.przedstawSie();
        mariola.przedstawSie();
    }
}
