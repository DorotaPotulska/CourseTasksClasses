package JavaGda34.weekend5.zad11_kolekcje_powtorka;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Lambda {

    public static void main(String[] args) {
        List<String> listaObecnosci=new ArrayList<>();

        listaObecnosci.add("ala");
        listaObecnosci.add("zygmunt");
        listaObecnosci.add("ola");
        listaObecnosci.add("alan");

        listaObecnosci.forEach(elementListy-> System.out.println(elementListy));

    }


}
