package JavaGda34.weekend4.interfejsy.zad4_Grzeje_Chlodzi;

import java.util.Scanner;

public class Klimatyzacja implements Grzeje,Chlodzi {

    double temp;

    public void setTemp(double temp) {
        this.temp = temp;
    }

    @Override
    public double pobierzTemp(){
        return this.temp;
    }

    @Override
    public void zwiekszTemp(){
        System.out.println("Zwiekszam o 10");
        setTemp(pobierzTemp()+10);
    }

    @Override
    public void wyswietlTemp() {
        System.out.println("Aktualna temperatura wynosi "+ pobierzTemp() +"stopni Celcjusza");
    }

    @Override
    public void zmniejszTemp(){
        System.out.println("Zmniejszam o 10");
        setTemp(pobierzTemp() - 10);
    }
}
