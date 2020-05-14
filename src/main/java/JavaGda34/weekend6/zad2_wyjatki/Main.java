package JavaGda34.weekend6.zad2_wyjatki;

public class Main {
    public static void main(String[] args) {
        KontoBankowe kontobankowe = new KontoBankowe(100);

        try {
            kontobankowe.wyplacSrodki(10);// jak tu wiszemy wiecej niz 100 to rzuci wyjatkiem jawnym
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(kontobankowe.stanKonta);

        kontobankowe.test();
    }
}
