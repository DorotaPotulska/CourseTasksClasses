package JavaGda34.weekend3.dziedziczenie9;

public class Kukulka extends Ptak {
    public Kukulka() {
        System.out.println("Domyslny konstruktor klasy Kukulka");
    }

    @Override
    public String toString(){
        return "to jest nowy to String "+rozpietoscSkrzydel+" umaszczenie "+umaszczenie;
    }
}
