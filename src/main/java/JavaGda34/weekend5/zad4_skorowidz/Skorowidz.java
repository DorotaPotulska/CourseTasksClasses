package JavaGda34.weekend5.zad4_skorowidz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Skorowidz {
    protected static Map<String, Set<Integer>> skorowidzLiterowy(String tekst) {
        String[] tablicaLiter = tekst.split("");

        Map<String, Set<Integer>> skorowidz = new HashMap<>();
        //Set<Integer> dataset = new HashSet<Integer>();

        for (int i = 0; i < tablicaLiter.length; i++) {
            if (skorowidz.containsKey(tablicaLiter[i])) {
                skorowidz.get(tablicaLiter[i]).add(i);

            } else  {
                skorowidz.put(tablicaLiter[i],new HashSet<Integer>() );
                skorowidz.get(tablicaLiter[i]).add(i);
            }
        }

        return skorowidz;
    }
}
