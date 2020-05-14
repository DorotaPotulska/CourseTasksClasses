package JavaGda34.weekend5.zad15_StreamMap_NIE_DZIAŁA;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Wesz wsza = new Wesz(10);
        Pies burek = new Pies("Burek",wsza);
        Czlowiek czlowiek = new Czlowiek(burek, "jan");

        List<Czlowiek> czlowieki = Arrays.asList(czlowiek);

        ZakladPracy stocznia = new ZakladPracy(czlowieki);

        List<Wesz> listaWszy= (List<Wesz>) stocznia.getPracownicy().stream()
                .filter(c->c.getImie().equalsIgnoreCase("jan"))
                .map(c->c.getPies().getWsza())
                .collect(Collectors.toSet());

        System.out.println(listaWszy);
    }
}
