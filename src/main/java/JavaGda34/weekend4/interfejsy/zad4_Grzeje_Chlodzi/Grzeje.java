package JavaGda34.weekend4.interfejsy.zad4_Grzeje_Chlodzi;

public interface Grzeje {

    double pobierzTemp();

    void zwiekszTemp();

    default void wyswietlTemp(){
        System.out.println("Aktualna temperatura wynosi "+ pobierzTemp() +"stopni Celcjusza");
    }
            ;
}
