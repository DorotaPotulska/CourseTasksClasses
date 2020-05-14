package JavaGda34.weekend2.obiektowe2;

public class Osoba2 {

    String imie;
    int wiek;
    char plec;

    //metoda konstruktora
    public Osoba2(String imieNadane,int wiekNadany,char plecPodana){
        this.imie=imieNadane;
        this.wiek=wiekNadany;
        this.plec=plecPodana;
    }

    public void przedstawSie(){

        System.out.println(imie+" "+wiek+" "+plec);

    }
}
