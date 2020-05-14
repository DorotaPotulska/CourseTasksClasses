package JavaGda34.weekend5.zad16_optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String samochod=null;

        Optional<String > optionalString =Optional.ofNullable(samochod);

        optionalString.ifPresent(tekst-> System.out.println(tekst.toUpperCase()));

        // tu wyrzuci bład
        //Optional<String > optionalString2 =Optional.of(samochod);

       // optionalString2.ifPresent(tekst-> System.out.println(tekst.toUpperCase()));

        Optional<String> optional = Optional.of("");
        // When
        boolean isPresent = optional.isPresent();

        System.out.println(isPresent);//true
///////////////////////////////////////

        Optional<String > optional2=Optional.ofNullable(null);

        String wynikSrodkaOptionala = optional2.orElse(metoda());

        System.out.println(wynikSrodkaOptionala);

        ////////////////////
        Optional<String > optional3=Optional.ofNullable("Jesteem w optional3");

        String wynikSrodkaOptionala2 = optional3.orElse(metoda());

        System.out.println(wynikSrodkaOptionala2);

    }

    public static String metoda(){
        return "tratata";
    }
}
