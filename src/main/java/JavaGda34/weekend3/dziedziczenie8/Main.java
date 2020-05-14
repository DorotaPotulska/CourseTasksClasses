package JavaGda34.weekend3.dziedziczenie8;

public class Main {
    public static void main(String[] args) {
        Ptak ptaszek = new Ptak();

        ptaszek.dajGlos();

        Ptak inny = new Ptak(1.0d,"szary");
        inny.dajGlos();
        Kukulka kukulka=new Kukulka(2.0d,"czarna");
        kukulka.dajGlos();

    }
}
