package JavaGda34.weekend2.obiektowe;

public class Osoba {
    String imie;
    int rokUrodzenia;
    char plec;
    public int wiek(int rokUrodzenia) {
        return (2019 - rokUrodzenia);
    }

    public void przedstawSie() {
        System.out.println("Cześć! Mam na imię " + imie + " i mam " + wiek(rokUrodzenia) + " lat.");
    }


}
