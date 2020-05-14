package JavaGda34.weekend4.interfejsy.zad3_Pokarm;

public class Pokarm {
    String nazwa;
    TypPokarmu typPokarmu;
    int waga;

    public Pokarm(String nazwa, TypPokarmu typPokarmu, int waga) {
        this.nazwa = nazwa;
        this.typPokarmu = typPokarmu;
        this.waga = waga;
    }

    public TypPokarmu getTypPokarmu() {
        return typPokarmu;
    }

    public int getWaga() {
        return waga;
    }
}
