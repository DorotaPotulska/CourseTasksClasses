package JavaGda34.weekend3.polimorfizm14;

public class Main {
    public static void main(String[] args) {
        Kwadrat kwadrat=new Kwadrat();
        kwadrat.metodaKwadratu();

        Prostokat prostokat=kwadrat;

        prostokat.metodaProstokata();

        Figura figura=prostokat;

        figura.metodaFigura();

    }
}
