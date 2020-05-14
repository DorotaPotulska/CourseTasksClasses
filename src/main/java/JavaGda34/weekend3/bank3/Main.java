package JavaGda34.weekend3.bank3;

public class Main {
    public static void main(String[] args) {
        KontoBankowe andrzeja = new KontoBankowe(123l,100l);

        KontoBankowe beaty = new KontoBankowe(444l,1000000l);

        KontoBankowe cwaniaczka =new KontoBankowe(666l,0);

        //cwaniaczka.stanKonta=beaty.stanKonta; -- to nie działa
       // beaty.stanKonta=0;
        //poeyzej mozemy zmianic stan konta beaty
        //po wprowadzeniu getterów mamy tylko mozliwosc wysyłki $ z naszego konta wiec cwaniaczek nie moze zabrac z konta beaty
        //dlatego te argumenty powinny byc prywatne a nie publiczne

        andrzeja.przelewWychodzacy(beaty,1l);



    }
}
