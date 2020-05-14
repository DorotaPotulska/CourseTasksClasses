package JavaGda34.weekend4.interfejsy.zad4_Grzeje_Chlodzi;

public interface Chlodzi {

    double pobierzTemp();

    void zmniejszTemp();

    default void wyswietlTemp(){
        System.out.println("Aktualna temperatura wynosi "+ pobierzTemp() +"stopni Celcjusza");
    }
}
