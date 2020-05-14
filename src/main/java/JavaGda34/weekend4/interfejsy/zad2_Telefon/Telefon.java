package JavaGda34.weekend4.interfejsy.zad2_Telefon;

import java.util.Random;

public class Telefon implements Dzwoni{

   String numerTelefonu;
   int lacznyCzasRozmow = 0;

//    public Telefon(String numerTelefonu) {
//        this.numerTelefonu = numerTelefonu;
//        this.lacznyCzasRozmow = 0;
//    }


    @Override
    public void zadzwon(String numerTelefonu) {
        Random rd=new Random();

        if(rd.nextInt(100)<90){
            System.out.println("Dzodzwonilismy się na numer " + numerTelefonu);

            int czasRozmowy = rd.nextInt(60)+1;
            this.lacznyCzasRozmow+=czasRozmowy;
            System.out.println("Rozmowa trwała "+czasRozmowy+" minut");
        }else{
            System.out.println("Brak sieci");
        }
        System.out.println("łączny czas rozmowy wyniósł " +this.lacznyCzasRozmow+" minut");

    }

    @Override
    public void zadzwonNaNrAlarmowy() {
        zadzwon(this.numerAlarmowy);
    }
}
