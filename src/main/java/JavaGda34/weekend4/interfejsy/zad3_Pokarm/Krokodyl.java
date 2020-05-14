package JavaGda34.weekend4.interfejsy.zad3_Pokarm;

public class Krokodyl implements Jedzacy {
    private int iloscPosilkowWZyciu;
    private int lacznaWagaZjedzonychPosilkow;

    public Krokodyl() {
        this.iloscPosilkowWZyciu = 0;
        this.lacznaWagaZjedzonychPosilkow = 0;
    }

    @Override
    public void jedz(Pokarm pokarm) {
        if(pokarm.getTypPokarmu()==TypPokarmu.MIESO){
            System.out.println("Krokodyl łap łap łap "+pokarm.getTypPokarmu());
            iloscPosilkowWZyciu++;
            System.out.println("ilosc posilkow "+iloscPosilkowWZyciu);
            lacznaWagaZjedzonychPosilkow+=pokarm.getWaga();
            System.out.println("łaczna waga posilkow "+lacznaWagaZjedzonychPosilkow);
        }


    }

    @Override
    public int ilePosilkowZjedzone() {
        return iloscPosilkowWZyciu;
    }

    @Override
    public int ileGramowZjedzone() {
        return lacznaWagaZjedzonychPosilkow;
    }

    @Override
    public String toString() {
        return "Krokodyl{" +
                "iloscPosilkowWZyciu=" + iloscPosilkowWZyciu +
                ", lacznaWagaZjedzonychPosilkow=" + lacznaWagaZjedzonychPosilkow +
                '}';
    }
}
