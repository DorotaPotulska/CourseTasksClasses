package JavaGda34.weekend3.ulamek_DOKONCZ_SKRACANIE5;

public class Ulamek {
    private int licznik;
    private int mianownik;

    public Ulamek(int licznik, int mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;
    }

    public void wypisz(){

        System.out.println(licznik+"/"+mianownik);
    }

    private Ulamek[] sprowadzDoWspolnegoMianownika(Ulamek pierwszy, Ulamek drugi){
        Ulamek[] wyniki = new Ulamek[2];
       /* wyniki[0]=pierwszy;
        wyniki[1]=drugi;

        wyniki[0].licznik=wyniki[0].licznik*wyniki[1].mianownik;
        wyniki[1].licznik=wyniki[1].licznik*wyniki[0].mianownik;
        wyniki[0].mianownik=wyniki[1].mianownik=wyniki[0].mianownik*wyniki[1].mianownik;
*/

        int nowyLicznikPierwszego=pierwszy.licznik*drugi.mianownik;
        int nowyLicznikDrugiego=drugi.licznik*pierwszy.mianownik;
        int nowyMianownik=pierwszy.mianownik*drugi.mianownik;

        Ulamek pierwszySprowadzony=new Ulamek(nowyLicznikPierwszego,nowyMianownik);
        Ulamek drugiSprowadzony=new Ulamek(nowyLicznikDrugiego,nowyMianownik);

        wyniki[0]=pierwszySprowadzony;
        wyniki[1]=drugiSprowadzony;
        return wyniki;
    }
    public void dodaj(Ulamek tenDoDodania){
        Ulamek[] tablicaSprowadzonych = sprowadzDoWspolnegoMianownika(this,tenDoDodania);

        this.licznik=tablicaSprowadzonych[0].licznik+tablicaSprowadzonych[1].licznik;
        this.mianownik=tablicaSprowadzonych[0].mianownik;
    }

    public void odejmij(Ulamek tenDoOdjecia){
        Ulamek[] tablicaSprowadzonych = sprowadzDoWspolnegoMianownika(this,tenDoOdjecia);

        this.licznik=tablicaSprowadzonych[0].licznik-tablicaSprowadzonych[1].licznik;
        this.mianownik=tablicaSprowadzonych[0].mianownik;
    }

    public void mnozenie(Ulamek tenDoMnozenia){

        this.licznik=this.licznik*tenDoMnozenia.licznik;
        this.mianownik=this.mianownik*tenDoMnozenia.mianownik;
    }

    public void dzielenie(Ulamek tenPrzezKtoryDziele){

        this.licznik=this.licznik*tenPrzezKtoryDziele.mianownik;
        this.mianownik=this.mianownik*tenPrzezKtoryDziele.licznik;
    }

    public void skroc(){
        for(int i=licznik;i>0 ;i--){

            if(licznik%i==0 && mianownik%i==0){
                licznik=licznik/i;
                mianownik=mianownik/i;
                i=licznik;

            }
            if(licznik==1 ||mianownik==1){
                break;
            }
        }
        System.out.println(licznik+"/"+mianownik);
    }
}
