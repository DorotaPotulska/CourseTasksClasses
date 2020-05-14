package JavaGda34.weekend3.enumy6;

public class Main {
    public static void main(String[] args) {
        Bilet normalny = Bilet.NORMALNY;
        Bilet ulgowy = Bilet.ULGOWY;

        System.out.println(normalny);
        System.out.println(Bilet.NORMALNY);
        System.out.println(Bilet.NORMALNY.getCena());

        System.out.println(ulgowy);
        System.out.println(ulgowy.getCena());
    }
}
