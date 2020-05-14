package JavaGda34.weekend3.samochod11;

public class Main {
    public static void main(String[] args) {

        Samochod samochod = new Samochod("czerwony", "opel", 2005);
        Kabriolet kabriolet = new Kabriolet("czerwony", "BMV", 2010, true);
        Kabriolet kabriolet1=new Kabriolet("czerwony","opel",2005,true);
        Kabriolet kabriolet2=new Kabriolet("czerwony","opel",2005,true);
        Kabriolet kabriolet3=kabriolet2;


        System.out.println(samochod.toString());
        System.out.println(kabriolet.toString());

        System.out.println(samochod.equals(kabriolet));
        System.out.println(kabriolet.equals(samochod));

        System.out.println(samochod.equals(kabriolet1));

        System.out.println(kabriolet.equals(kabriolet1));

        System.out.println(kabriolet2.equals(kabriolet1));
//this == obj - to sprawdzenie sprawdza czy to sa te same obiekty, wskazuja na te same miejsca w stercie
        /*Kabriolet kabriolet2=new Kabriolet("czerwony","opel",2005,true);
        Kabriolet kabriolet3=kabriolet2;*/
        // dwie zmienne kierują do jednego miejsca w chmurze
        System.out.println(kabriolet3.equals(kabriolet2));
    }
}
