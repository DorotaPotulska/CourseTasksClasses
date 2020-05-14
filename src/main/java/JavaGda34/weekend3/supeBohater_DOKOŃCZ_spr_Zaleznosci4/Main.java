package JavaGda34.weekend3.supeBohater_DOKOŃCZ_spr_Zaleznosci4;
/*1. Utwórz klasę „SuperBohater”
        2. Dodaj 2 pola tekstowe : nazwa, supermoc
        3. Utwórz 3 bohaterów
        4. Przećwicz zachowanie obiektów na przykładach:
        a. bohater1 = bohater2; bohater1=null; sout(bohater2==null)
        b. bohater1=null; bohater2=bohater1; bohater1=bohater3; sout przyrównanie do null na każdym z bohaterów
        5. *Przećwicz zachowanie się Stringów poprzez tworzenie literałów i nowych obiektów typu String
        a. Sprawdź zachowanie metody .equals()
        b. Sprawdź zachowanie przyrównania ==*/
public class Main {
    public static void main(String[] args) {
        SuperBohater bohater1 = new SuperBohater("Gary", "znikam");
        SuperBohater bohater2 = new SuperBohater("Cezary", "szybko biegam");
        SuperBohater bohater3 = new SuperBohater("Mary", "czary");

        System.out.println("Podpunkt A");
        //a. bohater1 = bohater2; bohater1=null; sout(bohater2==null)
        bohater1=bohater2;
        bohater1.przedstawSie();

        bohater1=null;
        //bohater1.przedstawSie();
        System.out.println(bohater1);
        System.out.println(bohater2==null);

        //b. bohater1=null; bohater2=bohater1; bohater1=bohater3; sout przyrównanie do null na każdym z bohaterów
        System.out.println("Podpunkt B");
        bohater1=null;
        System.out.println(bohater1);
        bohater2.przedstawSie();
        bohater2=bohater1;
        bohater2.przedstawSie();
        bohater1=bohater3;
        bohater1.przedstawSie();
        bohater2=null;
        System.out.println(bohater2);
        bohater3=null;
        System.out.println(bohater3);
    }
}
