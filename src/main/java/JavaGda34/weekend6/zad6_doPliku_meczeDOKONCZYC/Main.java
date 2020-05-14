package JavaGda34.weekend6.zad6_doPliku_meczeDOKONCZYC;
/*Zadanie 6.4 Napisz program, który będzie pobierał od użytkownika wyniki meczów piłkarskich
        i zapisywał je linia po linii do pliku w postaci:
        Drużyna1 <Bramek>(Karne) : (Karne)<Bramek>Drużyna2
        • Jeśli mecz się roztrzygnął wynikiem bramkowym, to nie pytaj użytkownika o karne i nie zapisuj ich
        do pliku! Przykład:
        Brazylia <1> : <2>Belgia
        Rosja <2>(3) : (4)<2>Chorwacja
        Szwecja <1> : <0>Szwajcaria
        • *dodatkowe: Spraw, aby drużyna wygrana zawsze była zapisana po lewej stronie.*/
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Scanner in= new Scanner(System.in);
        int iloscMeczow;

        System.out.println("Ile meczów chcesz wprowadzić");
        iloscMeczow=in.nextInt();
StringBuilder sb =new StringBuilder("");
        for(int i=0; i<iloscMeczow;i++){
            sb.append(pobierz());
        }
    }
    private static void pobierzWynikMeczuiZapiszDoPliku()  {
       // zapiszDoPliku(pobierz());

        try {
            zapiszDoPliku(pobierz());
        }catch(FileNotFoundException e ){
            e.printStackTrace();
            System.out.println("Nie powidł sie zapis do pliku");
        }
    }
    public static String pobierz()  {
        String druzyna1;
        String bramki1;
        String karne1;
        String druzyna2;
        String bramki2;
        String karne2;

        Scanner in =new Scanner(System.in);

        System.out.println("Podaj nazwe pierwszej drużyny");
        druzyna1=in.nextLine();
        System.out.println("Podaj nazwe drugiej drużyny");
        druzyna2=in.nextLine();
        System.out.println("Podaj ilosc bramek drużyny "+druzyna1);
        bramki1=in.nextLine();
        System.out.println("Podaj ilosc bramek drużyny "+druzyna2);
        bramki2=in.nextLine();

        if(bramki1.trim().equalsIgnoreCase(bramki2.trim())){
            System.out.println("Podaj liczbę goli karnych "+druzyna1);
            karne1=in.nextLine();
            System.out.println("Podaj liczbę goli karnych "+druzyna2);
            karne2=in.nextLine();
            return druzyna1+"<"+bramki1+">("+karne1+"):("+karne2+")<"+bramki2+">"+druzyna2;
        }
        return druzyna1+"<"+bramki1+">:<"+bramki2+">"+druzyna2;
    }

    public static void zapiszDoPliku(String wynikDoZapisania) throws FileNotFoundException {
        PrintWriter tekstowy = new PrintWriter("C:\\Users\\cdc4\\Desktop\\SDA_JAVA\\plik.txt");
        tekstowy.append(wynikDoZapisania);
        tekstowy.close();

    }
}
