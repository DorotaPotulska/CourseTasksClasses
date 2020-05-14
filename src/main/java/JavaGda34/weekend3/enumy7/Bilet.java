package JavaGda34.weekend3.enumy7;

import java.util.Scanner;

/*1. Zamodelować sytuację zakupu biletu
  2. Utworzyć enum Bilet
  3. Nadać następujące wartości:
        a. ULGOWY_GODZINNY
        b. ULGOWY_CALODNIOWY
        c. NORMALNY_GODZINNY
        d. NORMALNY_CALODNIOWY
        e. BRAK_BILETU
  4. Dodać konstruktor przyjmujący 2 parametry:
        a. cena (double)
        b. czasJazdy w minutach (int)
  5. Nadać odpowiednie wartości startowe
  6. Utworzyć metodę pobierzCeneBiletu():double
  7. Utworzyć metodę pobierzCzasJazdy():int
  8. Utworzyć metodę wyswietlDaneOBilecie():void np. „Bilet ulgowy 1-godzinny”
  9. Utwórz kilka biletów, wywołaj metody i przetestuj działanie
  10. * Utwórz metodę statyczną przyjmująca wiek osoby kupującej bilet,
        czas jazdy w minutach oraz kwotę – zwróć odpowiedni bilet
        (w przypadku niewystarczających środków zwróć BRAK_BILETU)*/
public enum Bilet {
    ULGOWY_GODZINNY(3.0d,60),
    ULGOWY_CALODNIOWY(6.0d,24*60),
    NORMALNY_GODZINNY(4.0d,60),
    NORMALNY_CALODNIOWY(8.0d,24*60),
    BRAK_BILETU(0.0d,0);

    private double cena;
    private int czasJazdy;

    Bilet(double cena,int czasJazdy) {
        this.cena=cena;
        this.czasJazdy=czasJazdy;
    }

    public double getCena() {
        return cena;
    }

    public int getCzasJazdy() {
        return czasJazdy;
    }

    public double pobierzCeneBiletu(){
        return getCena() ;

    }
    public int pobierzCzasJazdy(){
        return getCzasJazdy();
    }

    public void wyswietlDaneOBilecie(){
        System.out.println("Bilet "+this.name().toLowerCase()+ " kosztuje " +this.cena+" i jest na "+((double)this.getCzasJazdy())/60+ " godzinny");
    }
    /*Utwórz metodę statyczną przyjmująca wiek osoby kupującej bilet,
    czas jazdy w minutach oraz kwotę – zwróć odpowiedni bilet
            (w przypadku niewystarczających środków zwróć BRAK_BILETU)*/
    public static Bilet dobierzBilet(int wiek,int czasJazdy,double kwota){
        if(wiek>25){
            if(czasJazdy>60){
                if(kwota>NORMALNY_CALODNIOWY.getCena()){
                    return NORMALNY_CALODNIOWY;
                }else {
                    return BRAK_BILETU;
                }
            }else {
                if(kwota>NORMALNY_GODZINNY.getCena()){
                    return NORMALNY_GODZINNY;
                }else {
                    return BRAK_BILETU;
                }
            }
        }else{
            if(czasJazdy>60){
                if(kwota>ULGOWY_CALODNIOWY.getCena()){
                    return ULGOWY_CALODNIOWY;
                }else{
                    return BRAK_BILETU;
                }
            }else{
                if(kwota>ULGOWY_GODZINNY.getCena()){
                    return ULGOWY_GODZINNY;
                }else{
                    return BRAK_BILETU;
                }
            }

        }
    }
}
