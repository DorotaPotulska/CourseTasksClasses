package JavaGda34.weekend4.interfejsy.zad3_Pokarm;
/*
                1. Utwórz klasę Pokarm o polach:
                    1. Nazwa
                    2. TypPokarmu
                    3. Waga
                2. Utwórz enum TypPokarmu {MIĘSO, OWOCE, NABIAŁ...}
                3. Utwórz interfejs Jedzący
                4. Dodaj metody
                    1. jedz(Pokarm pokarm):void
                    2. ilePosilkowZjedzone(): int
                    3. ileGramowZjedzone() :int
                5. Utwórz klasy Weganin, Krokodyl, Programista
                6. Zaimplementuj interfejs w wymienionych klasach
                7. Uwzględnij typ jedzenia oraz możliwości osobników
                8. W klasie Main utwórz przedstawicieli klas i dodaj ich do wspólnej tablicy
                9. Przeiteruj tablicę kilkukrotnie dla różnych pokarmów i znajdź 2 zwyciężców:
                    1. Gracza który zjadł najwięcej posiłków (Pokarmów)
                    2. Gracza ktory zjadł największą masę jedzenia (gramy)*/

public class Main {
    public static void main(String[] args) {
        Jedzacy krokodyl= new Krokodyl();
        Jedzacy programista=new Programista();
        Jedzacy weganin=new Weganin();

        Jedzacy[] jedzacy={krokodyl,weganin,programista};

        Pokarm pokarm1=new Pokarm("szynka",TypPokarmu.MIESO,10);
        Pokarm pokarm2=new Pokarm("sałata",TypPokarmu.WARZYWA,1);
        Pokarm pokarm3=new Pokarm("feta",TypPokarmu.NABIAL,2);
        Pokarm pokarm4=new Pokarm("banan",TypPokarmu.OWOCE,3);
        Pokarm pokarm5=new Pokarm("sałata",TypPokarmu.WARZYWA,1);

        Pokarm[] tabPokarm ={pokarm1,pokarm2,pokarm3,pokarm4,pokarm5};

        System.out.println("Pierwsze karmienie");

        for(int i=0; i<jedzacy.length;i++){
            for (int j=0;j<tabPokarm.length;j++){
                jedzacy[i].jedz(tabPokarm[j]);
            }
        }

        System.out.println("Drugie karmienie");

        for(int i=0; i<jedzacy.length;i++){
            for (int j=0;j<tabPokarm.length;j++){
                jedzacy[i].jedz(tabPokarm[j]);
            }
        }
        System.out.println("Ilosc zjedzonych posilkow");

        for(int i=0; i<jedzacy.length;i++){

            System.out.println(jedzacy[i]+"zjadl "+ jedzacy[i].ilePosilkowZjedzone());

        }

        int jedzacyNajwiecejPosilkow=znajdzIndeksJedzacegoNajwiecejPosilkow(jedzacy);

        System.out.println("Najwiecej posilkow zjadl "+jedzacy[jedzacyNajwiecejPosilkow].toString());

        int jedzacyNajwiecejGramow=znajdzIndeksJedzacegoNajwiecejGramow(jedzacy);

        System.out.println("Najwiecej gramow zjadl "+jedzacy[jedzacyNajwiecejGramow].toString());

    }
    static private int znajdzIndeksJedzacegoNajwiecejPosilkow( Jedzacy[] tabDoPrzeszukiwania){
        int maxIloscPosilkow=-1;
        int idexMaxJedzacego = -1;

        for(int i=0; i<tabDoPrzeszukiwania.length;i++){
            if(tabDoPrzeszukiwania[i].ilePosilkowZjedzone()>maxIloscPosilkow){
                System.out.println("max ilosc posilkow"+maxIloscPosilkow);
                maxIloscPosilkow=tabDoPrzeszukiwania[i].ilePosilkowZjedzone();
                idexMaxJedzacego=i;
                System.out.println("max ilosc posilkow"+maxIloscPosilkow);
                System.out.println("indeks "+idexMaxJedzacego);
            }
        }
        return idexMaxJedzacego;
    }

    static private int znajdzIndeksJedzacegoNajwiecejGramow( Jedzacy[] tabDoPrzeszukiwania){
        int maxIloscGramow=-1;
        int idexMaxJedzacego = -1;

        for(int i=0; i<tabDoPrzeszukiwania.length;i++){
            if(tabDoPrzeszukiwania[i].ileGramowZjedzone()>maxIloscGramow){
                System.out.println("max ilosc gramow"+maxIloscGramow);
                maxIloscGramow=tabDoPrzeszukiwania[i].ileGramowZjedzone();
                idexMaxJedzacego=i;
                System.out.println("max ilosc gramow"+maxIloscGramow);
                System.out.println("indeks "+idexMaxJedzacego);
            }
        }
        return idexMaxJedzacego;
    }

}
