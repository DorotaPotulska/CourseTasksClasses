package JavaGda34.weekend4.interfejsy.zad3_Pokarm;

public class Weganin implements Jedzacy{

    private int iloscPosilkowWZyciu;
    private int lacznaWagaZjedzonychPosilkow;

    public Weganin() {
        this.iloscPosilkowWZyciu = 0;
        this.lacznaWagaZjedzonychPosilkow = 0;
    }

    @Override
    public void jedz(Pokarm pokarm) {
        if(pokarm.getTypPokarmu()==TypPokarmu.WARZYWA){
            System.out.println("Weganin hrup hrup hrup " +pokarm.getTypPokarmu());
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
        return "Weganin{" +
                "iloscPosilkowWZyciu=" + iloscPosilkowWZyciu +
                ", lacznaWagaZjedzonychPosilkow=" + lacznaWagaZjedzonychPosilkow +
                '}';
    }
}
